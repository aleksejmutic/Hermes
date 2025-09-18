package model.konekcijaNaBazu;

import java.awt.Component;
import java.sql.*;

import javax.swing.JOptionPane;



/**
 * Apstraktna klasa zasluzna za kreiranje i implementiranje osnovnih podataka neophodnih za konekciju na bazu.
 * 
 * @author Željko Ikanović
 * 
 */
public abstract class DbConnection {
	
	protected Connection conn = null;
	
	DatabaseType type = null;
	String address = null;
	String fullAddress = null;
	String dbName = null;
	String port = null;
	String driver = null;
	String user = null;
	String password = null;
	String url = null;	
	
	/**
	 * Metoda kreira konekciju sa zadatim parametrima.
	 * 
	 * @param adress
	 *            URL adresa baze podataka
	 * @param port
	 *            Port na kojem se nalazi baza podataka. Ako je <code>null</code> uzima se predodredjeni port
	 * @param dbName
	 *            Ime baze podataka na koju se konektuje
	 * @param user
	 *            Ime korisnika
	 * @param password
	 *            Lozinka korisnika
	 * @return Ako je konekcija uspjesna vraca se kao parametar, ako nije onda se vraca null vrijednost.
	 */
	public abstract Connection getConnection(String address, String	port, String dbName, String user, String password);
		
	public Connection getConnection()
	{
		if(conn != null)
		{
			return conn;
		}
		return null;
	}
	
	protected void ErrorHandlerMethod(Component component, String errorMsg)
	{
		JOptionPane.showMessageDialog(component, errorMsg, "Error",0);
	}
	
	/**
	 * Metoda {@link #closeConnection()} sluzi za zatvaranje konekcije. Nakon zatvaranja objekat tipa {@link Connection}
	 * postavlja se na vrijednost <code>null</code>.
	 */	
	public void closeConnection() {
		if(conn == null)
			return;
		try
		{
			conn.close();
		}
		catch (Exception e) {
			ErrorHandlerMethod(null, e.getMessage());
		}
		finally {
			conn = null;
		}
	}
	
	/**
	 * Metoda {@link #isConnectionOpen()} provjerava da li je konekcija otvorena.
	 * 
	 * @return <code>True</code> ako je konekcija otvorena u suprotnom <code>False</code>.
	 */
	public boolean isConnectionOpen() {
		return (conn != null);
	}
	/**
	 * Metoda {@link #isConnectionValid(int)} provjerava da li je konekcija validna.
	 * 
	 * @return <code>True</code> ako je konekcija validna u suprotnom <code>False</code>.
	 */
	public boolean isConnectionValid(int timeout)
	{
		if(conn != null)
		{
			try 
			{
				return conn.isValid(timeout);
			}
			catch (Exception e) {
				ErrorHandlerMethod(null, e.getMessage());
			}
		}
		return false;
	}

	public Connection getConn() {
		return conn;
	}

	public DatabaseType getType() {
		return type;
	}

	public String getAddress() {
		return address;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public String getDbName() {
		return dbName;
	}

	public String getPort() {
		return port;
	}

	public String getDriver() {
		return driver;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}
	
}
