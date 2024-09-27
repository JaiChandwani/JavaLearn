import java.util.Scanner;

public class A3IfElseQuestion {
    public static void main(String[] args) {
        findMaxOfThreeNumber();
        characterCaseCheck();
        fibonacciSeries();
        findingTheOccuranceForArray();
        findingTheOccuranceForInteger();
        reversingANumber();
    }

        public static void findMaxOfThreeNumber(){
            Scanner input = new Scanner(System.in);

            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int maxNum ;

            // Q:) Find the maximum of 3 number.

            if(num1 > num2){
                maxNum = num1;
                System.out.println(maxNum);
            }
            else if (num2>num3){
                maxNum = num2;
                System.out.println(maxNum);
            }
            else{
                maxNum = num3;
                System.out.println(maxNum);
            }

        }
        public static void characterCaseCheck(){
        Scanner in = new Scanner(System.in);
            System.out.print("Enter a word: ");
           String word = in.next();
           char c = word.charAt(0);
           if(c>='a' && c<='z'){
               System.out.println("The character is: "+c);
               System.out.println("LowerCase");
           }
           else{
               System.out.println("The character is: "+c);
               System.out.println("UpperCase");
           }
        }
        public static void fibonacciSeries(){
        Scanner in = new Scanner(System.in);
        int count = 0 ;
        int previousNum = 0;
        int nextNum = 1;
            System.out.print("Enter a number: ");
        int num = in.nextInt();
            System.out.println(previousNum);
            System.out.println(nextNum);
        for (;count<=num;count++){
            int temp = nextNum;
            nextNum = previousNum+nextNum;
            previousNum = temp;
        System.out.println(nextNum);
           }
        }

    public static void findingTheOccuranceForArray() {
                int temp = 0;
        int[] num ={3,7,4,5,7,3,7,5};
        for(int count = 0;count<=num.length-1;count++){
            if(num[count]==7){
                temp++;
            }
        }
        System.out.println(temp);
    }

    public static void findingTheOccuranceForInteger() {
        int count =0;
        int num = 1383;

        for(;num>0;){
            int rem = num%10; // last digit
            if(rem==3){
                count++;
            }
           num = num/10;
        }
        System.out.println(count);
    }

    public static void reversingANumber() {
        int count = 0;
        int num = 192392;
        int temp = 0;
        for(;num>0;){
            temp = num%10; // gives last number
            num = num/10;
            System.out.print(temp);
        }
    }
}
