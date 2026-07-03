package Arrays;
import java.util.*;
class pascalTrianngle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        ArrayList<Integer> list=new ArrayList<>();
        int ans=1;
        list.add(ans);
        for(int i=0;i<n;i++){
            ans=ans*(n-i);
            ans=ans/(i+1);
            list.add(ans);
        }

        for(int x:list){
            System.out.print(x+" ");
        }
    }
}
