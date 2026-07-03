package Arrays;

import java.util.*;

public class majorityII {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(majority(nums));
    }

    public static ArrayList<Integer> majority(int[] arr){

    int candidate1 = 0;
    int candidate2 = 0;

    int count1 = 0;
    int count2 = 0;

    for(int num : arr){

        if(candidate1 == num){
            count1++;
        }
        else if(candidate2 == num){
            count2++;
        }
        else if(count1 == 0){
            candidate1 = num;
            count1 = 1;
        }
        else if(count2 == 0){
            candidate2 = num;
            count2 = 1;
        }
        else{
            count1--;
            count2--;
        }
    }

    count1 = 0;
    count2 = 0;

    for(int num : arr){
        if(num == candidate1){
            count1++;
        }
        else if(num == candidate2){
            count2++;
        }
    }

    ArrayList<Integer> ans = new ArrayList<>();

    if(count1 > arr.length / 3){
        ans.add(candidate1);
    }

    if(count2 > arr.length / 3){
        ans.add(candidate2);
    }

    return ans;
}
}
