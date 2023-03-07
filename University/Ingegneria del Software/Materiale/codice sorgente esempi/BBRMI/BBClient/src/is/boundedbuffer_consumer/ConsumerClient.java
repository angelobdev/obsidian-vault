package is.boundedbuffer_consumer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import is.bbrmi.BBConsumerIF;
import is.bbrmi.BoundedBufferFactory;
import is.bbrmi.Message;

public class ConsumerClient {

	public static void main(String[] args) {
		if (System.getSecurityManager() == null) {
			System.out.println("no sec manager found! Installing it");
	        System.setSecurityManager(new SecurityManager());
	    }
	 
		BoundedBufferFactory factory = null;
		BBConsumerIF bb = null;
		try (Scanner sc = new Scanner(System.in)) {
			String host="127.0.0.1";//inserire l'ip del server

			System.out.println("listing");
			String[] list=Naming.list("rmi://"+host);
			for (String s : list) {
				System.out.println(s);
			}
			System.out.println("lookup");
			factory = (BoundedBufferFactory) Naming.lookup("rmi://"+host+"/boundedbufferfactory");
			System.out.println("found "+factory);
			
			bb = factory.getConsumerIF();

			String answer = null;
			Message msg = null;
			for (;;) {
				System.out.print("Press Invio to receive ");
				answer = sc.nextLine();
				msg = (Message) bb.get();
				System.out.println("received msg " + msg + " with buffer time=" + msg.getBufferTime() + " ms");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// main
}// ConsumerClient
