package A14Interface;

public class Mamel implements Animal {
    public void eat(){
        System.out.println("food");
    }
    public void live(){
        System.out.println("land");
    }

    public static void main(String[] args) {
        Mamel m = new Mamel();
        m.eat();
        m.live();
    }
}
