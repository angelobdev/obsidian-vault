package is.bbrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BBProducerIF extends Remote {
	void put(Message m) throws RemoteException;
}
