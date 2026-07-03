package BasicMaths;
import java.util.*;

public class primeUSingSeive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        seive(n);
        sc.close();
    }

    public static void seive(int n){
        
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
    }
}
