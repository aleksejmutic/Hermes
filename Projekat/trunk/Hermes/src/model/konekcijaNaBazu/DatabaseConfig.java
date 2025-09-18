package model.konekcijaNaBazu;

public class DatabaseConfig {

	   private String address;
	    private String port;
	    private String dbName;
	    private String user;
	    private String password;

	    public DatabaseConfig(String address, String port, String dbName, String user, String password) {
	        this.address = address;
	        this.port = port;
	        this.dbName = dbName;
	        this.user = user;
	        this.password = password;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public String getPort() {
	        return port;
	    }

	    public String getDbName() {
	        return dbName;
	    }

	    public String getUser() {
	        return user;
	    }

	    public String getPassword() {
	        return password;
	    }
}
