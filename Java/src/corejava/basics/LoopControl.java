package corejava.basics;

// loop control
public class LoopControl {
    public static void main(String args[]) {
        String [] names = {"Siddharth", "Pranjal", "Priyanshi", "Khushi"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
        System.out.println("\n");
        // decision making
        System.out.println(3 > 2 ? true : false);
    }
}