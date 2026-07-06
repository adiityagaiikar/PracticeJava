package Heaps;
import java.util.*;

public class kthlargest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();

        System.out.println(kth(arr,k));
    }

    public static int kth(int arr[],int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int num: arr){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }

        return pq.peek();
    }
}