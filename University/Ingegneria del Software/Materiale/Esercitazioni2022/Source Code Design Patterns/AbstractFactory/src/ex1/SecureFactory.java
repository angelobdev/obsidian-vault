package ex1;

import factorymethod.ex1.Connection;

public class SecureFactory implements ConnectionFactory {
	//Concrete Factory
	
	public Connection createConnection(String type) {
		if (type.equals("Oracle")) {
			return new SecureOracleConnection();
		} else if (type.equals("SQL Server")) {
			return new SecureSqlServerConnection();
		} else {
			return new SecureMySqlConnection();
		}
	}
}