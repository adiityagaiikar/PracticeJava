package Greedy;
import java.util.*;

public class toSaveBoats {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        int limit=sc.nextInt();

        sc.close();
        System.out.println(solve(nums,limit));
    }

    public static int solve(int []people,int limit){
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boats=0;

        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
}
