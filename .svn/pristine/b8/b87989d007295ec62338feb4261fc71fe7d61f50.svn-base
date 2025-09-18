package model.konekcijaNaBazu;

import java.sql.*;
import java.util.List;
import java.util.Vector;


/**
 * Klasa {@link DbManipulation} sluzi za realizaciju konekcije. Zaduzena je za rukovanje konekcijom te izborom
 * konektora.
 * 
 * @author Željko Ikanović
 * 
 */
public class DbManipulation {

	public static List<DbManipulation> dbManip = new Vector<>();
	private DbConnection dbConnection = null;

	public DbManipulation(DatabaseType type, String address, String port, String dbName, String user, String password) {
		
		switch (type) {
		case MsSQL_JDBC:
			dbConnection = new MsSqlJdbcConnection();
			break;
		case MsSQL_JTDS:
			dbConnection = new MsSqlJtdsConnection();
			break;
		case MySQL:
			dbConnection = new MySqlConnection();
			break;
		default:
			break;
		}
		
		dbConnection.getConnection(address, port, dbName, user, password);
	}
	
	public static DbManipulation createConnection(DatabaseType type, String address, String port, String dbName, String user, String password) {
		if(!(dbManip.size()>0))
		{
			DbManipulation dbManipulation = new DbManipulation(type, address, port, dbName, user, password);
			dbManip.add(dbManipulation);
			
			return dbManipulation;
		}
		else
		{
			for (DbManipulation dbManipulation : dbManip) {
				if(dbManipulation.dataExists(type, address, port, dbName, user, password))
				{
					if(dbManipulation.isConnectionValid(5)) {
						return dbManipulation;
					}
					else {
						dbManipulation.closeConnection();
						
						DbManipulation manipulation = new DbManipulation(type, address, port, dbName, user, password);
						dbManip.add(manipulation);
						
						return manipulation;
					}
				}
				else {
					DbManipulation manipulation = new DbManipulation(type, address, port, dbName, user, password);
					dbManip.add(manipulation);
					
					return manipulation;
				}
			}
		}
		return null;
	}
	
	public Connection getConnection() {
		int index = dbManip.indexOf(this);
		if(dbManip.size() > 0 && index != -1)
		{
			dbConnection = dbManip.get(index).dbConnection;
		}
		if(dbConnection != null)
		{
			return dbConnection.getConnection();
		}
		return null;
	}
	
	private boolean dataExists(DatabaseType type, String address, String port, String dbName, String user, String password) {
		if(dbConnection.getType().equals(type) 
				&& dbConnection.getAddress() == address
				&& dbConnection.getPort() == port
				&& dbConnection.getUser() == user
				&& dbConnection.getPassword() == password)
		{
			return true;
		}
		return false;
	} 
	
	private boolean isConnectionValid(int timeout)
	{
		int index = dbManip.indexOf(this);
		
		if(dbManip.size() > 0 && index != -1)
		{
			dbConnection = dbManip.get(index).dbConnection;
		}
		else {
			return false;
		}
		
		if(dbConnection != null)
		{
			return dbConnection.isConnectionValid(timeout);
			
		}
		return false;
	}
	
	public void closeConnection() {
		int index = dbManip.indexOf(this);
		if(dbManip.size() > 0 && index != -1)
		{
			dbConnection = dbManip.get(index).dbConnection;
		}
		if(dbConnection != null)
		{
			dbConnection.closeConnection();
			
			if(index != -1)
			{
				dbManip.remove(index);
			}
		}
	}
	
	public String getDbName() {
		return dbConnection.getDbName();
	}
}
