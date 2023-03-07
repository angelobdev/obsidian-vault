package ex1;

import factorymethod.ex1.Connection;

public class SecureSqlServerConnection extends Connection {
	//Product
	
	public String description() {
		return "SQL Server secure";
	}
}