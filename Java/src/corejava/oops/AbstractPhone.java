package corejava.oops;

// Abstraction
public abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;
    }
    public abstract void call(int outgoingNumber);
    public abstract void ring(int incomingNumber);
}

