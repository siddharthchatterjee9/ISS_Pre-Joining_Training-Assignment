package corejava.exception;

import java.rmi.RemoteException;

//  throws is used to postpone the handling of a checked exception
//  throw is used to invoke an exception explicitly.

public class throwthrows {
        public void deposit(double amount) throws RemoteException {
            // Method implementation
            throw new RemoteException();
        }
        // Remainder of class definition
}
