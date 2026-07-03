package BasicMaths;
import java.util.*;

public class reverseNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        System.out.println(reverse(n));
    }

    public static int reverse(int n){
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        return reverse;
    }
}
