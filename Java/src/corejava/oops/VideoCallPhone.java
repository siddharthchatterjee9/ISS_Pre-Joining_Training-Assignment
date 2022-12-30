package corejava.oops;

public class VideoCallPhone extends AbstractPhone {
    public VideoCallPhone(int year) {
        super(year);
    }
    @Override
    public void call(int outgoingNumber) {
        System.out.println("Connecting video call to " + outgoingNumber);
    }
    @Override
    public void ring(int incomingNumber) {
        System.out.println("Incoming video call from " + incomingNumber);
    }
}
