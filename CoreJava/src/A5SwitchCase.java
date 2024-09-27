import java.util.Scanner;


public class A5SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();
        // old style
        switch (fruits){
            case "mango":
                System.out.println("🥭");
                break;
            case "apple":
                System.out.println("🍎");
                break;
            default:
                System.out.println("😋");
        }
        //new style
        switch (fruits){
            case "mango" -> System.out.println("🥭");
            case "apple" -> System.out.println("🍎");
            default -> System.out.println("😋");
        }
    }
}
