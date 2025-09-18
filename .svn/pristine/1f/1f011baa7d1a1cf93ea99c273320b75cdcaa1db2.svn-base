package view.menubar.menus;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JMenu;

import model.konekcijaNaBazu.DbManipulation;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import view.JasperReportsViewer;
import view.MenuItem;
/**
 * Klasa za definisanje menija za rad sa izvještajima.
 * 
 * @author Aleksej Mutić
 * @version 1.0
 */
public class ReportsMenu extends JMenu implements Menu{
	
	private MenuItem adresnicaReport = null; 
	private MenuItem posiljkaReport = null; 
	
	public ReportsMenu() {
		super("Izvještaj");
		
		Connection conn = DbManipulation.dbManip.get(0).getConnection();
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		adresnicaReport = new MenuItem("Adresnica");
		Image firstReportIcon = toolkit.getImage("src/icons/pin.png");
		firstReportIcon = firstReportIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH); 
		adresnicaReport.setIcon(new ImageIcon(firstReportIcon));
		adresnicaReport.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        JasperReportsViewer viewer = new JasperReportsViewer(conn);
		        viewer.showReport("src/reports/Adresnica.jrxml");
		    }
		});
		add(adresnicaReport);
		
		posiljkaReport = new MenuItem("Pošiljka");
		Image secondReportIcon = toolkit.getImage("src/icons/package.png");
		secondReportIcon = secondReportIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH); 
		posiljkaReport.setIcon(new ImageIcon(secondReportIcon));
		posiljkaReport.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        JasperReportsViewer viewer = new JasperReportsViewer(conn);
		        viewer.showReport("src/reports/Posiljka.jrxml");
		    }
		});
		add(posiljkaReport);
	}

	@Override
	public void idleState() {
		adresnicaReport.setEnabled(true);
		posiljkaReport.setEnabled(true);
	}

	@Override
	public void activeState() {
		adresnicaReport.setEnabled(true);
		posiljkaReport.setEnabled(true);
	}

	@Override
	public void editState() {
		adresnicaReport.setEnabled(true);
		posiljkaReport.setEnabled(true);
	}
	
	
}
