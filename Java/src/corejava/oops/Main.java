package corejava.oops;
/* Author is Siddharth Chatterjee */
public class Main {
    public static void main (String[] args) {
        AbstractPhone phone = new OrdinaryLandlinePhone(1984);
        AbstractPhone videoPhone = new VideoCallPhone(2018);
        User user = new User("Siddharth");
        // Calling 58649
        user.callAnotherUser(58649, phone);
        // Connecting video call to 58649
        user.callAnotherUser(58649, videoPhone);

        // Receive call from 20737
        user.pickupAnotherUser(20737, phone);
        // Receive video call from 20737
        user.pickupAnotherUser(20737, videoPhone);

    }
}
