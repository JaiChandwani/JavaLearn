package A13MethodOverriding;

public class SubClass extends SuperClass{
    public static void main(String[] args) {
       SubClass subClass = new SubClass();
        subClass.test();
}
    @Override
    public void test(){
        System.out.println("I am Child");
    }
    }