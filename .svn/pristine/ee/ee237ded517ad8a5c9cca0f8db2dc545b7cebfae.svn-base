package model.command;

import model.ApplicationModel;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 * UpdateCommand updates existing row data in the database based on a primary
 * key.
 */
public class UpdateCommand extends Command {

	private Map<String, JComponent> entryData;
	private HashMap<String, String> updateData;
	private Object editRow;

	public UpdateCommand(ApplicationModel applicationModel, Object editRow, Map<String, JComponent> entryData) {
		super(applicationModel);
		this.entryData = entryData;
		this.editRow = editRow;
		this.updateData = new HashMap<String, String>();
	}

	@Override
	public void execute() {
		int response = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da želite da izmjenite ovaj podatak?",
				"Potvrda izmjene", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

		if (response == JOptionPane.YES_OPTION) {

			for (Map.Entry<String, JComponent> entry : entryData.entrySet()) {
	            String key = entry.getKey();
	            JComponent comp = entry.getValue();
	            String value = null;

	            if (comp == null) {
	                value = null;
	            } else if (comp instanceof JTextComponent) {
	                String text = ((JTextComponent) comp).getText();
	                value = (text == null || text.trim().isEmpty()) ? null : text;
	            } else if (comp instanceof JComboBox) {
	                Object selected = ((JComboBox<?>) comp).getSelectedItem();
	                value = (selected == null || selected.toString().trim().isEmpty()) ? null : selected.toString();
	            } else if (comp instanceof JCheckBox) {
	                value = Boolean.toString(((JCheckBox) comp).isSelected());
	            } else if (comp instanceof JSpinner) {
	                Object val = ((JSpinner) comp).getValue();
	                if (val instanceof java.util.Date) {
	                    java.time.LocalDateTime ldt = ((java.util.Date) val)
	                            .toInstant()
	                            .atZone(java.time.ZoneId.systemDefault())
	                            .toLocalDateTime();
	                    value = ldt.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	                } else {
	                    value = val.toString();
	                }
	            } else {
	                value = comp.toString();
	            }

	            updateData.put(key, value); 
	        }

			this.applicationModel.getApplicationState().editRow(updateData);
			this.applicationModel.notifySubscribers();
			JOptionPane.showMessageDialog(null, "Podatak je uspješno izmjenjen!");
		}
	}
}