package corejava.oops;

// Encapsulation and access control

public class SomePhone {
    private int year;
    private String company;
    public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;
    }
    private void openConnection(){
        // findSwitch
        // openNewConnection...
    }
    public void call() {
        openConnection();
        System.out.println("Calling");
    }

    public void ring() {
        System.out.println("Ring-ring");
    }
}