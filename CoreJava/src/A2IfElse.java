import java.util.Scanner;

public class A2IfElse {
    public static void main(String[] args) {
       firstProgram();
       secondProgram();
        }
    public static void firstProgram() {
        int requiredAge = 18;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you age: ");
        int age = input.nextInt();
        if (age >= requiredAge) {
            System.out.println("You can Drive");
        } else {
            System.out.println("Wait for the correct age.");
        }
    }

    public static void secondProgram(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        if(salary <= 25000){
            int newSalary = salary+1000;
            System.out.println(newSalary);
        } else if (salary>25000 || salary <35000) {
            int newSalary = salary+2000;
            System.out.println(newSalary);
        }else{
            int newSalary = salary+500;
            System.out.println(newSalary);
        }
    }
}
