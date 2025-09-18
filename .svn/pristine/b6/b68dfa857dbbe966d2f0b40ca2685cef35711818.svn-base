package view;

import model.ApplicationModel;
import model.DataModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class ShipmentIdWindow extends JFrame {
    private final ApplicationModel applicationModel;
    private DataModel shipmentDataModel;

    public ShipmentIdWindow(ApplicationModel applicationModel) {
        this.applicationModel = applicationModel;

        setTitle("Shipment Tracking");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(550, 450);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Left panel sa slikom
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(new Color(173, 216, 230));
        JLabel imageLabel = new JLabel(new ImageIcon(
                new ImageIcon("src/icons/hermes.png")
                        .getImage()
                        .getScaledInstance(200, 200, Image.SCALE_SMOOTH)
        ));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
        leftPanel.add(imageLabel, BorderLayout.CENTER);

        // Right panel sa unosom ID-a
        JPanel rightPanel = new JPanel(new GridBagLayout());
        rightPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel label = new JLabel("Unesi ID pošiljke:");
        label.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField txtShipmentId = new JTextField(20);
        txtShipmentId.setPreferredSize(new Dimension(250, 40));
        JButton btnConfirm = createStyledButton("Confirm");

        gbc.gridy = 0;
        rightPanel.add(label, gbc);
        gbc.gridy = 1;
        rightPanel.add(txtShipmentId, gbc);
        gbc.gridy = 2;
        rightPanel.add(Box.createVerticalStrut(5), gbc);
        gbc.gridy = 3;
        rightPanel.add(btnConfirm, gbc);

        leftPanel.setPreferredSize(new Dimension(getWidth() / 2, getHeight()));
        rightPanel.setPreferredSize(new Dimension(getWidth() / 2, getHeight()));

        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.CENTER);
        add(mainPanel);

        // Inicijalizacija DataModel
        try {
            shipmentDataModel = new DataModel("Aktivne posiljke");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Action Listener
        btnConfirm.addActionListener(e -> {
            String posiljkaId = txtShipmentId.getText().trim();
            if (posiljkaId.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Molim vas unesite ID pošiljke!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            List<Object> row = shipmentDataModel.getPackageLocationwById(posiljkaId);

            if (row != null) {
                StringBuilder info = new StringBuilder();
                    info.append("Poslovna jedinica: ")
                        .append(row.get(0))
                        .append("\nAdresa: ")
                        .append(row.get(1));
                JOptionPane.showMessageDialog(this, info.toString(), "Pošiljka Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Pošiljka sa ID \"" + posiljkaId + "\" nije pronađena.", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setVisible(true);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(250, 40));
        button.setBackground(new Color(173, 216, 230));
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                BorderFactory.createEmptyBorder(10, 10, 10, 10))
        );
        button.addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent e) { button.setBackground(new Color(135, 206, 250)); }
            @Override public void mouseExited(MouseEvent e) { button.setBackground(new Color(173, 216, 230)); }
        });
        return button;
    }
}
