package model;

import java.util.List;
import java.util.Vector;

public class TableColumnModel {

	private String columName;
	private String columType;
	private String columLabel;
	private boolean isPrimaryKey;
	private boolean isAutoIncrement;
	private boolean isNullable;
	private String refColumn;
	private String refTable;
	private List<Object> fkData;
	
	public TableColumnModel(String columnName, String columnType, String columLabel, boolean isPrimaryKey, boolean isAutoIncrement, boolean isNullable, String refColumn, String refTable) {
		this.columName = columnName;
		this.columType = columnType;
		this.columLabel = columLabel;
		this.isPrimaryKey = isPrimaryKey;
		this.isAutoIncrement = isAutoIncrement;
		this.refColumn = refColumn;
		this.refTable = refTable;
		this.isNullable = isNullable;
	}

	public String getColumName() {
		return columName;
	}

	public void setColumName(String columName) {
		this.columName = columName;
	}

	public String getColumType() {
		return columType;
	}

	public void setColumType(String columType) {
		this.columType = columType;
	}

	public boolean isPrimaryKey() {
		return isPrimaryKey;
	}

	public void setPrimaryKey(boolean isPrimaryKey) {
		this.isPrimaryKey = isPrimaryKey;
	}

	public boolean isAutoIncrement() {
		return isAutoIncrement;
	}

	public void setAutoIncrement(boolean isAutoIncrement) {
		this.isAutoIncrement = isAutoIncrement;
	}

	public boolean isNullable() {
		return isNullable;
	}

	public void setNullable(boolean isNullable) {
		this.isNullable = isNullable;
	}

	public String getRefColumn() {
		return refColumn;
	}

	public void setRefColumn(String refColumn) {
		this.refColumn = refColumn;
	}

	public String getRefTable() {
		return refTable;
	}

	public void setRefTable(String refTable) {
		this.refTable = refTable;
	}

	public List<Object> getFkData() {
		return fkData;
	}

	public String getColumLabel() {
		return columLabel;
	}

	public void setColumLabel(String columLabel) {
		this.columLabel = columLabel;
	}

	public void setFkData(List<Object> fkData) {
		if(this.fkData == null)
		{
			this.fkData = new Vector<Object>();
			this.fkData = fkData;
		}
		this.fkData = fkData;
	}
	
	
}
