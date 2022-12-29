package corejava.oops;

public class Main {
    public static void main (String[] args) {
        Movie obj1 = new Movie();
        Movie obj2 = new Movie("Lakshya", "War/Drama", "Hrithik Roshan", 2004, 79.54);
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        Movie obj3 = new Movie();
        obj3.setTitle("Qayamat Se Qayamat Tak");
        obj3.setGenre("Romance/Drama");
        obj3.setStar("Juhi Chawla");
        obj3.setYear(1988);
        obj3.setEarnings(5.50);
        System.out.println(obj3.toString());
    }
}
