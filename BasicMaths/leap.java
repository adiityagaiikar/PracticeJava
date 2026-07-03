package BasicMaths;

import java.util.Scanner;

public class leap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        boolean ans=solve(n); 
        System.out.println(ans);
    }

    public static boolean solve(int n){
        if(n%400==0){
            return true;
        }
        if(n%100==0){
            return false;
        }
        if(n%4==0){
            return true;
        }
        return false;
    }
}
