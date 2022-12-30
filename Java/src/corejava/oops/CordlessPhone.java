package corejava.oops;

// Inheritance
public abstract class CordlessPhone extends AbstractPhone {

    private int hour;

    public CordlessPhone (int year, int hour) {
        super(year);
        this.hour = hour;
    }
}

