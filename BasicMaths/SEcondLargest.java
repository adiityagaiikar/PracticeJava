package BasicMaths;

import java.util.*;

public class SEcondLargest {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(second(nums));
    }

    public static int second(int[] nums){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : nums){

            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}