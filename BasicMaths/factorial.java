package BasicMaths;
import java.util.*;

public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int ans=solve(n); 
        System.out.println(ans);
    }

    public static int solve(int n){
        if(n<=1){
            return 1;
        }
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }

        return fact;
    }
}
