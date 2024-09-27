public class A8Shadowing {
    static int x = 100; // accessible by whole class.
    public static void main(String[] args) {
        System.out.println(x); // will print 100.
        int x = 40; // will shadow the x of parent scope.
        System.out.println(x); // will print 40.
        fun();
    }
    static void fun(){
        System.out.println(x); //100
    }
}
