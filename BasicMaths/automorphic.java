package BasicMaths;
import java.util.*;

public class automorphic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=solve(n);
        System.out.println(ans);
        sc.close();
    }

    public static boolean solve(int n){
        int square=n*n;
        int count=0;
        int temp=n;

        while(temp>0){
            count++;
            temp=temp/10;
        }

        if(n==0){
            count=1;
        }

        int divisor=1;
        for(int i=0;i<count;i++){
            divisor=divisor*10;
        }
        return(square%divisor)==n;
    }
}
