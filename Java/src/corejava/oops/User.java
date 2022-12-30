package corejava.oops;

// polymorphism
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    public void callAnotherUser(int number, AbstractPhone phone) {
    // And here's polymorphism: using the AbstractPhone type in the code!
        phone.call(number);
    }
    public void pickupAnotherUser(int number, AbstractPhone phone) {
        phone.ring(number);
    }
}