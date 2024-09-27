import java.util.Arrays;


public class A9VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10);
    }
    static void fun(int ...x)/*it will make an array and take number of arguments.*/{
        System.out.println(Arrays.toString(x));
    }
}
