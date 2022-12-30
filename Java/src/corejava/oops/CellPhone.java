package corejava.oops;

// Inheritance
public class CellPhone extends CordlessPhone {
    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outgoingNumber) {
        System.out.println("Calling " + outgoingNumber);
    }

    @Override
    public void ring(int incomingNumber) {
        System.out.println("Incoming call from " + incomingNumber);
    }
}