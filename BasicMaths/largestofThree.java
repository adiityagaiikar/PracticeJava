package BasicMaths;
import java.util.*;
public class largestofThree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        System.out.println(large(a,b,c));

    }

    public static int large(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }

        return max;
    }
}
