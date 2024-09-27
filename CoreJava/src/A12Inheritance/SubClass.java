package A12Inheritance;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        SubClass s = new SubClass(); // use any one of them
        SuperClass w = new SuperClass(); // use any one of them
        System.out.print(w.a);
        System.out.print(w.b);
        System.out.print(s.a);
        System.out.print(s.b);
        System.out.print(s.sum);
    }
//
}
