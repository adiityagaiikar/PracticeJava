package BasicMaths;
import java.util.*;

public class Strongnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
        sc.close();
    }

    public static boolean solve(int n){
        int temp=n;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        return sum==n;
    }
}
