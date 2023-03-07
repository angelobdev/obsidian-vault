package is.simpleRMI.server.app;

import is.simpleRMI.MsgSource;
import is.simpleRMI.server.SimpleMsgSource;
import is.simpleRMI.server.msg.CompoundMessage;
import is.simpleRMI.server.msg.SimpleMessage;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SimpleMsgServer {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.out.println("no sec manager found! Installing it");
            System.setSecurityManager(new SecurityManager());
        }

        try {
            System.out.println("Costruzione oggetto locale ...");
            SimpleMsgSource msgSource = new SimpleMsgSource();
            msgSource.addMessage(new SimpleMessage("Ciao"));

            CompoundMessage cmpMsg = new CompoundMessage();
            cmpMsg.add("come va?");
            cmpMsg.add("come Stai?");

            msgSource.addMessage(cmpMsg);

            msgSource.addMessage(new SimpleMessage("ci vediamo presto"));

            System.out.println("created!");
            MsgSource stub = (MsgSource) UnicastRemoteObject.exportObject(msgSource, 0);
            System.out.println("Pubblicazione msg source ...");
            System.out.flush();

            //Registry registry = LocateRegistry.getRegistry();
            //System.out.println("Registry found" + registry);
            Naming.rebind("msgSrc", stub);

            System.out.println("In attesa di clienti ...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }// main
}

