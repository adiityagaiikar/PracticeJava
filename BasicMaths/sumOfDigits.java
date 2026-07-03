package BasicMaths;
import java.util.*;

public class sumOfDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(sum(n));
    }

    public static int sum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        return sum;
    }
}
