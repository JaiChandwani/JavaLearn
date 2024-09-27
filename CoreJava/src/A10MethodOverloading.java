import java.util.Scanner;

public class A10MethodOverloading {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int ans = sum(2,1);
        System.out.println(ans);
    }
    static int sum(){
        System.out.print("enter a number: ");
        int a = in.nextInt();
        System.out.print("enter another number: ");
        int b = in.nextInt();
        return (a+b);
    }
    static int sum(int a){
        System.out.print("enter a number: ");
        int b = in.nextInt();
        return (a+b);
    }
    static int sum(int a, int b){
        return (a+b);
    }
}
