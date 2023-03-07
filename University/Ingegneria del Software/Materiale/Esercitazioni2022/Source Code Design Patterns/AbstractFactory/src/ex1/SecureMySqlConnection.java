package ex1;
import factorymethod.ex1.Connection;

public class SecureMySqlConnection extends Connection {
	//Product
	
	public String description() {
		return "My Connection";
	}
}