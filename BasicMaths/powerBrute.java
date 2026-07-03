package BasicMaths;
import java.util.*;

public class powerBrute {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int power=sc.nextInt();
        solve(n,power);
        sc.close();
    }

    private static int solve(int n,int power) {
        int ans=1;
        for(int i=0;i<power;i++){
            ans=ans*n;
        }
        return ans;
    }
}
