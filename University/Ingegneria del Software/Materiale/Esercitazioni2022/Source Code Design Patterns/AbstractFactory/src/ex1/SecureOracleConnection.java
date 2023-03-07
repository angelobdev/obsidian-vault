package ex1;

import factorymethod.ex1.Connection;

public class SecureOracleConnection extends Connection {
	//Product
	
	public String description() {
		return "Oracle secure";
	}
}