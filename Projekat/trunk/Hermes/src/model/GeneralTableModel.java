package model;

import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Helpers.DataTypeMapper;
import model.konekcijaNaBazu.DBResultSet;
import parser.XMLTableGenerator;

public abstract class GeneralTableModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;

    protected List<TableColumnModel> columns;
    protected List<List<Object>> data;
    protected File databaseXml = new File("src\\resources\\databaseXML.xml");
    protected DBResultSet dBResultSet;
    protected ResultSet resultSet;
    protected Strategy strategy;
    protected CallableStatement callableSatement;

    HashMap<String, String> crudOps = new HashMap<>();

    public GeneralTableModel(String tableName) throws ParserConfigurationException, SAXException, IOException {
        if (!tableName.isEmpty()) {
        	setStrategy(new XMLParserStrategy(databaseXml));
        	setResultSet(new DBResultSet());
            this.columns = strategy.parseDataModel(tableName);
            crudOps = strategy.parseCrudOperations(tableName);
        } else {
            this.columns = new Vector<>();
        }
        this.data = new Vector<>();

        ensureDummyRow();
    }
    

    public Strategy getStrategy() {
		return strategy;
	}



	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	

	public DBResultSet getResultSet() {
		return dBResultSet;
	}


	public void setResultSet(DBResultSet dBResultSet) {
		this.dBResultSet = dBResultSet;
	}


	@Override
    public int getRowCount() {
        return this.data.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.size();
    }

    @Override
    public String getColumnName(int column) {
        return this.columns.get(column).getColumName();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (data.isEmpty() || rowIndex >= data.size() || columnIndex >= columns.size()) {
            return null;
        }
        return this.data.get(rowIndex).get(columnIndex);
    }

    public List<TableColumnModel> getColumns() {
        return columns;
    }

    public void setColumns(List<TableColumnModel> columns) {
        this.columns = columns;
        ensureDummyRow(); 
    }

    public List<List<Object>> getData() {
        return data;
    }

    public void setData(List<List<Object>> data) {
        this.data = data;
        if (data.isEmpty()) {
            ensureDummyRow();
        }
    }

    public Integer getHighestPrimaryKey() {
        if (columns == null || data == null || data.isEmpty())
            return null;

        int pkIndex = -1;
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).isPrimaryKey()) {
                pkIndex = i;
                break;
            }
        }

        if (pkIndex == -1) {
            return null;
        }

        Integer max = null;
        for (List<Object> row : data) {
            Object value = row.get(pkIndex);
            if (value instanceof Number) {
                int intValue = ((Number) value).intValue();
                if (max == null || intValue > max) {
                    max = intValue;
                }
            }
        }

        return max;
    }


    private void ensureDummyRow() {
        if (data.isEmpty() && columns != null && !columns.isEmpty()) {
            List<Object> emptyRow = new Vector<>();
            for (int i = 0; i < columns.size(); i++) {
                emptyRow.add(null);
            }
            data.add(emptyRow);
        }
    }

    public void getAllData() {
		this.data.clear();
		try {
			callableSatement = this.dBResultSet.getDbManipulation().getConnection().prepareCall("{ call " + crudOps.get("retrieve") + " }");

			resultSet = callableSatement.executeQuery();

			while (resultSet.next()) {
				List<Object> row = new Vector<Object>();

				for (int i = 0; i < columns.size(); i++) {
					row.add(resultSet.getObject(columns.get(i).getColumName()));
				}

				System.out.println("get all row: " + row.toString() + "\n");

				this.data.add(row);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public boolean deleteRow(HashMap<String, Object> columnPKs) {
		try {
			callableSatement = this.dBResultSet.getDbManipulation().getConnection().prepareCall("{ call " + crudOps.get("delete") + " }");
			int index=1;
			DataTypeMapper mapper = new DataTypeMapper();
				for (String key : columnPKs.keySet()) {
					mapper.mapDataToType(key, columnPKs.get(key).toString(), callableSatement, index);
					index++;
				}


			return callableSatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		return false;
	}
    public List<Object> getRowById(HashMap<String, Object> columnPKs){
		List<Object>  row = new Vector<Object>();
    	try {
			callableSatement = this.dBResultSet.getDbManipulation().getConnection().prepareCall("{ call " + crudOps.get("retrieveById") + " }");
			int index=1;
			DataTypeMapper mapper = new DataTypeMapper();
				for (String key : columnPKs.keySet()) {
					mapper.mapDataToType(key, columnPKs.get(key).toString(), callableSatement, index);
					index++;
				}


			resultSet=callableSatement.executeQuery();

			if (resultSet.next()) {
				for (int i = 0; i < columns.size(); i++) {
					row.add(resultSet.getObject(columns.get(i).getColumName()));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		return row.isEmpty() ? null : row;
    }

    public void addRow(HashMap<String, String> params) {
		try {
			callableSatement = this.dBResultSet.getDbManipulation().getConnection().prepareCall("{ call " + crudOps.get("create") + " }");

			DataTypeMapper mapper = new DataTypeMapper();
			int index = 1;

			for (TableColumnModel column : columns) {
				String colName = column.getColumName();
				String type = column.getColumType();
				String value = params.get(colName);

					mapper.mapDataToType(type, value, callableSatement, index);
					index++;
				}
		
			callableSatement.execute();
			
			this.getAllData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    public void editRow(HashMap<String, String> params) {
		try {
			callableSatement = this.dBResultSet.getDbManipulation().getConnection().prepareCall("{ call " + crudOps.get("update") + " }");

			DataTypeMapper mapper = new DataTypeMapper();
			int index = 1;

			for (TableColumnModel column : columns) {
				String colName = column.getColumName();
				String type = column.getColumType();
				String value = params.get(colName);

				if (value == null) {
					callableSatement.setObject(index, null);
				} else {
					mapper.mapDataToType(type, value, callableSatement, index);
				}
				index++;
			}

			System.out.println("Callable (editRow): " + callableSatement.toString());

			callableSatement.executeUpdate();
			this.getAllData();

		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
