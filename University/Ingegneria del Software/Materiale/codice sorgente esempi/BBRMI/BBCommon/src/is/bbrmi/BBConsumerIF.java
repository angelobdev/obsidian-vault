package is.bbrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BBConsumerIF extends Remote {
	Message get() throws RemoteException;
}
