package Greedy;
import java.util.*;

public class shortestJob {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(solve(nums));
    }

    public static double solve(int nums[]){
        Arrays.sort(nums);
        int currentTime=0;
        int waitingTime=0;
        for(int i=0;i<nums.length;i++){
            waitingTime=currentTime+waitingTime;
            currentTime=currentTime+nums[i];
        }
        return (double)waitingTime/nums.length;
    }
}
