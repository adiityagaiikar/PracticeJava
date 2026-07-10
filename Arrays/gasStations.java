package Arrays;
import java.util.*;

public class gasStations {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int gas[]=new int[n];
        for(int i=0;i<gas.length;i++){
            gas[i]=sc.nextInt();
        }

        int cost[]=new int[n];
        for(int i=0;i<cost.length;i++){
            cost[i]=sc.nextInt();
        }
        sc.close();

        System.out.println(canDo(gas, cost));
    }

    public static int canDo(int []gas,int cost[]){
        int total=0;
        int tank=0;
        int start=0;


        for (int i = 0; i < gas.length; i++) {
            int diff=gas[i]-cost[i];

            total=total+diff;
            tank=tank+diff;

            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        return total>=0?start:-1;
    }
}
