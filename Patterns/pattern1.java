package Patterns;
import java.util.*;

public class pattern1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        pattern11(n);
    }

    public static void pattern11(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
