package Heaps;
import java.util.*;

public class lastStoneWeight {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
    }

    public static int ans(int arr[]) {

    PriorityQueue<Integer> pq =
        new PriorityQueue<>(Collections.reverseOrder());

    // Step 1
    for(int num : arr){
        pq.offer(num);
    }

    // Step 2
    while(pq.size() > 1){

        int a = pq.poll();
        int b = pq.poll();

        if(a != b){
            pq.offer(a - b);
        }
    }

    // Step 3
    if(pq.isEmpty()){
        return 0;
    }

    return pq.peek();
}
}
