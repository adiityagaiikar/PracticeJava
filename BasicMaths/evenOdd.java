package BasicMaths;
import java.util.*;

class evenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
        sc.close();
    }

    public static void solve(int n){
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
