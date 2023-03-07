package is.bbrmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BoundedBufferServer {
	public static void main(String[] args) {
		if (System.getSecurityManager() == null) {
			System.out.println("no sec manager found! Installing it");
			System.setSecurityManager(new SecurityManager());
		}

		try {
			System.out.println("Costruzione factory ...");
			BoundedBufferFactory bbf = new BoundedBufferFactoryImpl();
			System.out.println("Pubblicazione factory ...");

			Naming.rebind("boundedbufferfactory", bbf);
			System.out.println("In attesa di clienti ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// main

}
