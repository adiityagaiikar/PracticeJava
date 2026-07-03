package BasicMaths;

import java.util.Scanner;

public class perfectNumber {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
        sc.close();
    } 

    public static boolean check(int n){
        int sum=0;
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
                return true;
        }
        return false;
    }

}
