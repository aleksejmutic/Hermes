package model.konekcijaNaBazu;

public class DBResultSet  {
	
	private DbManipulation dbManipulation = null;
	DatabaseConfig dbConfig;
	
	public DBResultSet() {
		dbConfig = DatabaseConfigParser.parseConfig("src\\resources\\databaseXML.xml");

		this.dbManipulation = DbManipulation.createConnection(DatabaseType.MsSQL_JDBC, dbConfig.getAddress(), 
		dbConfig.getPort(), dbConfig.getDbName(), dbConfig.getUser(), dbConfig.getPassword());
		
	}

	public DbManipulation getDbManipulation() {
		return dbManipulation;
	}

	public void setDbManipulation(DbManipulation dbManipulation) {
		this.dbManipulation = dbManipulation;
	}
	
}
