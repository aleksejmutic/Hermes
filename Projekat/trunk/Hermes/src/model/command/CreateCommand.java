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

public class CreateCommand extends Command {
    private Map<String, JComponent> entryData;
    private HashMap<String, String> newData;

    public CreateCommand(ApplicationModel applicationModel, Map<String,JComponent> entryData) {
        super(applicationModel);
        this.entryData = entryData;
        this.newData = new HashMap<String, String>();
    }

    @Override
    public void execute() {
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

            newData.put(key, value); 
        }

        System.out.println(newData.toString());
        this.applicationModel.getApplicationState().addRow(newData);
        this.applicationModel.notifySubscribers();
        JOptionPane.showMessageDialog(null, "Podatak je uspješno kreiran!");
    }

}