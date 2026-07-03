package BasicMaths;
import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        System.out.println(palindrome1(n));
    }

    public static boolean palindrome1(int n){
        int original=n;
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        return original==reverse;
    }
}
