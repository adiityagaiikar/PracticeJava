
package Patterns;
import java.util.*;

public class pattern5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        pattern11(n);
    }

    public static void pattern11(int n){
        for(int row=1;row<=2*n-1;row++){
            int totalcols;
            if(row<=n){
                totalcols=row;
            }else{
                totalcols=2*n-row;
            }

            for(int col=1;col<=totalcols;col++){
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
}
