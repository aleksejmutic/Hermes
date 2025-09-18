package model.konekcijaNaBazu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;



/**
 * Klasa zaduzena za realizaciju apstraktne metode {@link #getConnection(String, String, String, String, String)}.
 * Prosljedjuju se parametri koji su potrebni za kreiranje konekcije na MsSQL server sa jdbc konektorom.
 * 
 * @author Željko Ikanović
 * 
 */
public class MsSqlJdbcConnection extends DbConnection {

	@Override
	public Connection getConnection(String address, String port, String dbName, String user, String password) {
		
		this.type = DatabaseType.MsSQL_JDBC;
		this.driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		this.address = address.trim();
		this.dbName = dbName.trim();
		this.port = port.trim();
			
		
		if(this.port != null)
		{
			this.fullAddress = this.address + ":" + port.trim();
		}
		
		else
		{
			this.fullAddress = address;
		}
		
		this.url = "jdbc:sqlserver://" + this.fullAddress + ";";
		
		if(!isConnectionOpen())
		{
			this.user = user.trim();
			this.password = password.trim();
			
			try {
				
//				Class.forName(this.driver);
				
				Properties properties = new Properties();
				properties.put("databaseName", dbName.trim());
				properties.put("user", this.user);
				properties.put("password", this.password);
				properties.put("trustServerCertificate", "true");
				properties.put("integratedSecurity", "false");
				
				conn = DriverManager.getConnection(url,properties);
				
				return conn;
				
			} catch (Exception e) {
				ErrorHandlerMethod(null, e.getMessage());
			}
			
			return null;
		}
		
		return conn;
	}

	
}
