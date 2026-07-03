package BasicMaths;

import java.util.Scanner;

public class lcm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int ans=lcm1(a,b); 
        System.out.println(ans);
    }

    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static int lcm1(int a,int b){
        int lcm=(a*b)/gcd(a,b);
        return lcm;
    }
}
