package corejava.oops;

public class OrdinaryLandlinePhone extends AbstractPhone {
    public OrdinaryLandlinePhone(int year) {
        super(year);
    }

    @Override
    public void call(int outgoingNumber) {
        System.out.println("Calling " + outgoingNumber);
    }

    @Override
    public void ring(int incomingNumber) {
        System.out.println("The phone is ringing " + incomingNumber + " is displayed");
    }
}