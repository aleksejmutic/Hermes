package view;

import java.sql.Connection;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

public class JasperReportsViewer {

    private Connection connection;

    public JasperReportsViewer(Connection connection) {
        this.connection = connection;
    }

    public void showReport(String reportPath) {
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, connection);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}

