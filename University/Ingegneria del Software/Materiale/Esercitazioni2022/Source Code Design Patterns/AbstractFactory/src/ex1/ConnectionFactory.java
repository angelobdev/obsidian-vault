package ex1;

import factorymethod.ex1.Connection;

public interface ConnectionFactory {
	//Abstract Factory
	
	public Connection createConnection(String type);
}