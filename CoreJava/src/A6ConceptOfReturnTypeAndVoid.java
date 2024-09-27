import java.util.Scanner;

public class A6ConceptOfReturnTypeAndVoid {
    public static void main(String[] args) {

        int a = sum2();
        System.out.println("the sum of the number you entered is: "+a);

    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1+num2;
        return sum;
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1+num2;
        System.out.println(sum);
    }
}
