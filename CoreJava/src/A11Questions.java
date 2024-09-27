import java.util.Scanner;

public class A11Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prime number
     /*    int n = in.nextInt();
       boolean ans = isPrime(n);
        System.out.println(ans);*/

        //Armstrong number
        for(int i= 100;i<1000;i++){
            if(isArmStrong(i)){
                System.out.print(i+" ");
            }
        }

    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c= 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        else{return false;}
    }
    static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem= n%10;
            n=n/10;
            sum = sum + rem*rem*rem;
        }
        if (sum==original){
        return true;}
        else{
            return false;
        }
    }
}
