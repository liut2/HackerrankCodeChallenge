import java.io.*;
import java.util.*;

public class GCD {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        //String str=s.nextLine();
        System.out.println(helper(a, b, 2));
    }
    //the definition of the recursion is to calculate the GCD of current two numbers
    public static int helper(int a, int b, int divisor){
        //base case
        if (a == 1 || b == 1){
            return 1;
        }
        if (divisor > Math.min(a, b)){
            return 1;
        }
        //current level
        boolean ifDivisible = ifDivisible(a, b, divisor);
        if (ifDivisible){
            //next level
            return divisor * helper(a / divisor, b / divisor, divisor);
        }else{
            //next level
            return helper(a, b, divisor + 1);
        }

    }
    public static boolean ifDivisible(int a, int b, int divisor){
        boolean result1 = (a / divisor * divisor) == a;
        boolean result2 = (b / divisor * divisor) == b;
        return result1 && result2;
    }
}
