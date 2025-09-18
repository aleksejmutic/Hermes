package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Helpers.DataTypeMapper;
import observer.Subject;
import parser.XMLTableGenerator;
import model.ActiveState;
import model.ApplicationModel;
import model.ApplicationState;
import model.DataModel;
import model.EditState;
import model.GeneralTableModel;
import model.TableColumnModel;
import model.command.Command;
import model.command.CreateCommand;
import model.command.UpdateCommand;

public class Form extends JPanel implements ViewComponent {
	private static final long serialVersionUID = 8945128839816501668L;
	public ContextMenu formContextMenu;
	private DataTypeMapper dataTypeMapper = new DataTypeMapper();
	private ApplicationModel applicationModel;
	private Map<String, JComponent> inputFields = new LinkedHashMap<>();
	private JPanel formContentPanel;
	private ApplicationState state;

	public Form(ApplicationModel applicationModel) {
		this.applicationModel = applicationModel;
		setLayout(new BorderLayout());

		JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		topPanel.setBackground(new Color(200, 220, 240));
		
	    JButton closeButton = new JButton("X");
	    closeButton.setMargin(new Insets(2, 8, 2, 8));
	    closeButton.setFocusPainted(false);
	    closeButton.setBorderPainted(false);
	    closeButton.setBackground(Color.WHITE);
	    closeButton.setForeground(Color.BLACK);
	    
	    closeButton.addActionListener(e -> {
	        this.setVisible(false);
	    });

	    topPanel.add(closeButton, BorderLayout.NORTH);

		add(topPanel, BorderLayout.NORTH);

		setVisible(false);

		formContentPanel = new JPanel();
		formContentPanel.setBackground(new Color(173, 216, 230));
		formContentPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		formContentPanel.setLayout(new GridBagLayout());
		add(new JScrollPane(formContentPanel), BorderLayout.CENTER);
	}

	public ApplicationModel getApplicationModel() {
		return applicationModel;
	}

	public void setApplicationModel(ApplicationModel applicationModel) {
		this.applicationModel = applicationModel;
	}

	public Map<String, JComponent> getInputFields() {
		return inputFields;
	}

	public void setInputFields(Map<String, JComponent> inputFields) {
		this.inputFields = inputFields;
	}

	public ApplicationState getState() {
		return state;
	}

	public void setState(ApplicationState state) {
		this.state = state;
	}

	public void renderForm(ApplicationModel model, ApplicationState state, Object rowId, java.util.List<Object> rowData,
			Table table) {
		this.state = state;

		formContentPanel.removeAll();
		inputFields.clear();

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 15, 10, 15);
		gbc.anchor = GridBagConstraints.NORTHWEST;

		int row = 0;
		int col = 0;
		final int maxFieldsPerCol = 4;

		for (TableColumnModel column : model.getContext().getDataModel().getColumns()) {
			String columnName = column.getColumName();
			String columnLabel = column.getColumLabel();

			JLabel label = new JLabel(columnLabel + ":");
			label.setFont(new Font("SansSerif", Font.BOLD, 13));

			gbc.gridx = col * 2;
			gbc.gridy = row * 2;
			gbc.gridwidth = 2;
			formContentPanel.add(label, gbc);

			gbc.gridy = row * 2 + 1;

			if (column.getRefColumn() != null && !column.getRefColumn().isEmpty() && column.getRefTable() != null
					&& !column.getRefTable().isEmpty()) {

				JTextField fkField = new JTextField();
				fkField.setPreferredSize(new Dimension(120, 25));
				fkField.setEditable(false);

				JButton pickerBtn = new JButton("...");
				pickerBtn.setMargin(new Insets(2, 5, 2, 5));
				pickerBtn.addActionListener(ev -> {
					openReferencePicker(model, column, fkField);
				});

				JPanel fkPanel = new JPanel(new BorderLayout());
				fkPanel.add(fkField, BorderLayout.CENTER);
				fkPanel.add(pickerBtn, BorderLayout.EAST);

				formContentPanel.add(fkPanel, gbc);

				inputFields.put(columnName, fkField);

			} else {

				String columnType = dataTypeMapper.extractTypeName(column.getColumType());
				if (columnType.equals("datetime")) {
					SpinnerDateModel dateModel = new SpinnerDateModel();
					JSpinner dateTimeSpinner = new JSpinner(dateModel);
					JSpinner.DateEditor editor = new JSpinner.DateEditor(dateTimeSpinner, "yyyy-MM-dd HH:mm:ss");
					dateTimeSpinner.setEditor(editor);
					dateTimeSpinner.setPreferredSize(new Dimension(150, 25));

					formContentPanel.add(dateTimeSpinner, gbc);
					inputFields.put(columnName, dateTimeSpinner);
				} else {
					JTextField textField = new JTextField();
					textField.setPreferredSize(new Dimension(150, 25));

					if (column.isPrimaryKey() && column.isAutoIncrement()) {
						if (columnType.equals("varchar")) {
							String generatedKey = Helpers.KeyGenerator.generate(10);
							textField.setText(generatedKey);
							textField.setEditable(false);
						} else if (columnType.equals("int")) {
							int primaryKey = applicationModel.getContext().getDataModel().getHighestPrimaryKey() + 1;
							textField.setText(primaryKey + "");
							textField.setEditable(false);
						}
					}

					formContentPanel.add(textField, gbc);
					inputFields.put(columnName, textField);
				}
			}

			row++;
			if (row >= maxFieldsPerCol) {
				row = 0;
				col++;
			}
		}

		if (state != null) {
			this.populateFields(this, rowData);
		}

		gbc.gridx = 0;
		gbc.gridy = maxFieldsPerCol * 2 + 2;
		gbc.gridwidth = (col + 1) * 2;
		gbc.anchor = GridBagConstraints.CENTER;

		JPanel buttonPanel = new JPanel(new FlowLayout());
		JButton submitButton = new JButton("Submit");
		JButton cancelButton = new JButton("Cancel");

		submitButton.addActionListener(e -> {
			if (state != null) {
				this.handleSubmit(this, model, inputFields, table);
			}
		});

		cancelButton.addActionListener(e -> {
			setVisible(false);
			formContentPanel.removeAll();
			formContentPanel.revalidate();
			formContentPanel.repaint();
		});

		buttonPanel.add(submitButton);
		buttonPanel.add(cancelButton);
		formContentPanel.add(buttonPanel, gbc);

		formContentPanel.revalidate();
		formContentPanel.repaint();
	}

	private void openReferencePicker(ApplicationModel model, TableColumnModel column, JTextField targetField) {
		try {
			GeneralTableModel refTable = new DataModel(column.getRefTable());

			String[] colNames = refTable.getColumns().stream().map(TableColumnModel::getColumName)
					.toArray(String[]::new);

			Object[][] rowData = refTable.getData().stream().map(row -> row.toArray(new Object[0]))
					.toArray(Object[][]::new);

			DefaultTableModel tableModel = new DefaultTableModel(rowData, colNames);
			JTable table = new JTable(tableModel);
			JScrollPane scrollPane = new JScrollPane(table);

			JDialog dialog = new JDialog(SwingUtilities.getWindowAncestor(this), "Select from " + column.getRefTable(),
					Dialog.ModalityType.APPLICATION_MODAL);
			dialog.setSize(600, 400);
			dialog.setLocationRelativeTo(this);

			JButton selectBtn = new JButton("Izaberi");
			selectBtn.addActionListener(ev -> {
				int selectedRow = table.getSelectedRow();
				int colId = 0;
				int i = 0;
				if (selectedRow >= 0) {
					for (String colName : colNames) {
						if (colName.equals(column.getRefColumn())) {
							colId = i;
						} else {
							i++;
						}
					}
					Object value = table.getValueAt(selectedRow, colId);
					targetField.setText(value != null ? value.toString() : "");
				}
				dialog.dispose();
			});

			JButton newRecordBtn = new JButton("Novi Zapis");
			newRecordBtn.addActionListener(ev -> {
				JDialog newRecordDialog = new JDialog(dialog, "Novi zapis u " + column.getRefTable(),
						Dialog.ModalityType.APPLICATION_MODAL);
				newRecordDialog.setSize(500, 400);
				newRecordDialog.setLocationRelativeTo(dialog);

				ApplicationModel refAppModel = new ApplicationModel();
				refAppModel.getContext().setDataModel(column.getRefTable());
				Form newForm = new Form(refAppModel);

				newForm.renderForm(refAppModel, new ActiveState(refAppModel), null, null, null);

				newForm.setVisible(true);

				newRecordDialog.setContentPane(newForm);
				newRecordDialog.setVisible(true);

				GeneralTableModel refreshedTable;
				try {
					refreshedTable = new DataModel(column.getRefTable());
					Object[][] refreshedData = refreshedTable.getData().stream().map(row -> row.toArray(new Object[0]))
							.toArray(Object[][]::new);
					tableModel.setDataVector(refreshedData, colNames);
				} catch (ParserConfigurationException e) {

					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});

			JPanel panel = new JPanel(new BorderLayout());
			panel.add(scrollPane, BorderLayout.CENTER);

			JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
			buttonPanel.add(selectBtn);
			buttonPanel.add(newRecordBtn);

			panel.add(buttonPanel, BorderLayout.SOUTH);

			dialog.setContentPane(panel);
			dialog.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Failed to load reference data for table: " + column.getRefTable(),
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void populateFields(Form form, List<Object> rowData) {
		if (this.state instanceof EditState) {
			if (rowData != null) {
				int i = 0;
				for (String key : form.getInputFields().keySet()) {
					JComponent field = form.getInputFields().get(key);
					Object value = rowData.get(i++);

					if (field instanceof JTextComponent) {
						((JTextComponent) field).setText(value != null ? value.toString() : "");
					} else if (field instanceof JComboBox) {
						JComboBox<?> comboBox = (JComboBox<?>) field;
						if (value != null) {
							comboBox.setSelectedItem(value.toString());
						} else {
							comboBox.setSelectedIndex(-1);
						}
					}
				}
			}
		}
	}

	private void handleSubmit(Form form, ApplicationModel model, Map<String, JComponent> inputFields, Table table) {

		if (this.state instanceof EditState) {
			int rowIndex = table.getSelectedRow();
			Object editRowId = null;
			List<TableColumnModel> tableColumns = applicationModel.getContext().getDataModel().getColumns();
			if (applicationModel.getContext().getDataModel().getData().size() > 0) {
				List<Object> tableData = applicationModel.getContext().getDataModel().getData().get(rowIndex);

				for (int i = 0; i < tableColumns.size(); i++) {
					if (tableColumns.get(i).isPrimaryKey()) {
						editRowId = tableData.get(i);
					}
				}
			}
			Command command = new UpdateCommand(model, editRowId, inputFields);
			command.execute();
			this.setVisible(false);
		} else if (this.state instanceof ActiveState) {
			Command command = new CreateCommand(model, inputFields);
			command.execute();
			this.setVisible(false);
		}
	}

	@Override
	public void update(Subject applicationModel) {
		this.applicationModel = (ApplicationModel) applicationModel;
		formContentPanel.removeAll();
		formContentPanel.revalidate();
		formContentPanel.repaint();
	}
}
