package view;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import model.ApplicationModel;
import model.GeneralTableModel;
import model.TableColumnModel;

public class CustomTable extends JPanel {

	private JTable table;
	private ApplicationModel applicationModel;
	private GeneralTableModel tableModel;
	private int selectedRowIndex = -1;
	private ImageIcon fkIcon;

	public CustomTable(GeneralTableModel tableModel, ApplicationModel applicationModel) {
		this.tableModel = tableModel;
		this.applicationModel = applicationModel;

		// Load FK icon
		Image fkImage = new ImageIcon("src/icons/fk.png").getImage();
		Image scaledImageFk = fkImage.getScaledInstance(10, 10, Image.SCALE_SMOOTH);
		fkIcon = new ImageIcon(scaledImageFk);

		setLayout(new BorderLayout());

		initTable();
	}

	private void initTable() {
		String[] columnNames = tableModel.getColumns().stream().map(TableColumnModel::getColumLabel)
				.toArray(String[]::new);

		DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		for (List<Object> rowData : tableModel.getData()) {
			model.addRow(new Vector<>(rowData));
		}

		table = new JTable(model);
		table.setRowHeight(30);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getTableHeader().setReorderingAllowed(false);

		// Set custom cell renderer for icon
		for (int i = 0; i < tableModel.getColumns().size(); i++) {
			final TableColumnModel columnMeta = tableModel.getColumns().get(i);

			table.getColumnModel().getColumn(i).setCellRenderer(new DefaultTableCellRenderer() {
				@Override
				public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
						boolean hasFocus, int row, int column) {
					JPanel panel = new JPanel(new BorderLayout());
					panel.setOpaque(true);
					panel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5)); // top, left, bottom, right padding

					if (isSelected) {
						panel.setBackground(table.getSelectionBackground());
					} else {
						panel.setBackground(table.getBackground());
					}

					JLabel textLabel = new JLabel(value != null ? value.toString() : "");
					textLabel.setOpaque(false);
					textLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));

					panel.add(textLabel, BorderLayout.WEST);

					TableColumnModel columnMeta = tableModel.getColumns().get(column);
					if (columnMeta.getRefTable() != null && !columnMeta.getRefTable().isEmpty()) {
						JLabel iconLabel = new JLabel(fkIcon);
						iconLabel.setOpaque(false);
						iconLabel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));

						panel.add(iconLabel, BorderLayout.EAST);
					}

					return panel;
				}
			});
		}

		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				int col = table.columnAtPoint(e.getPoint());
				if (row < 0 || col < 0)
					return;

				selectedRowIndex = row;

				TableColumnModel column = tableModel.getColumns().get(col);

				if (e.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(e)) {
					if (column.getRefTable() != null && !column.getRefTable().isEmpty() && column.getRefColumn() != null
							&& !column.getRefColumn().isEmpty()) {
						openRefPanel(column.getRefTable());
					}
				}
			}
		});
	}

	private void openRefPanel(String refTable) {
		ApplicationModel refAppModel = new ApplicationModel();
		refAppModel.getContext().setDataModel(refTable);

		GeneralTableModel refTableModel = refAppModel.getContext().getDataModel();
		if (refTableModel == null)
			return;

		JFrame frame = new JFrame("Reference Table: " + refTable);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		frame.add(new CustomTable(refTableModel, refAppModel));
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("src/icons/hermes-logo.png");
		frame.setIconImage(icon.getImage());
		frame.setVisible(true);
	}

	public int getSelectedRowIndex() {
		return selectedRowIndex;
	}

	public void setSelectedRowIndex(int selectedRowIndex) {
		this.selectedRowIndex = selectedRowIndex;
		if (selectedRowIndex >= 0 && selectedRowIndex < table.getRowCount()) {
			table.setRowSelectionInterval(selectedRowIndex, selectedRowIndex);
			table.scrollRectToVisible(table.getCellRect(selectedRowIndex, 0, true));
		}
	}

	public void selectNextRow() {
		int rowCount = table.getRowCount();
		if (rowCount == 0)
			return;
		int next = (selectedRowIndex < rowCount - 1) ? selectedRowIndex + 1 : 0;
		setSelectedRowIndex(next);
	}

	public void selectPreviousRow() {
		int rowCount = table.getRowCount();
		if (rowCount == 0)
			return;
		int prev = (selectedRowIndex > 0) ? selectedRowIndex - 1 : rowCount - 1;
		setSelectedRowIndex(prev);
	}

	public void selectFirstRow() {
		if (table.getRowCount() > 0)
			setSelectedRowIndex(0);
	}

	public void selectLastRow() {
		int lastIndex = table.getRowCount() - 1;
		if (lastIndex >= 0)
			setSelectedRowIndex(lastIndex);
	}

	public GeneralTableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(GeneralTableModel tableModel) {
		this.tableModel = tableModel;
	}

	public void refreshData(GeneralTableModel tableModel) {
		this.tableModel = tableModel;

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0); 

		for (List<Object> rowData : tableModel.getData()) {
			model.addRow(new Vector<>(rowData));
		}

		revalidate();
		repaint();
	}
}
