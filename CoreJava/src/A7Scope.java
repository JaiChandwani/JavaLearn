public class A7Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // block scope
        {
            int c = 100; // initializing inside a block, so it can not be used outside of this block
        }
//        System.out.println(c); // uncomment it to see the error.

       //Method scope
        methodScopeExplain(a);
//        System.out.println(num); // uncomment to see the error.
        }
    static void methodScopeExplain(int num /*num initialized inside the method ,so it cannot be used outside it*/){
        System.out.println(num);

        // Loop Scope
        for(int i = 0 ; i<=10; i++){
            System.out.println(i);
        }
//        System.out.println(i); //uncomment this to see the error.
    }
}
