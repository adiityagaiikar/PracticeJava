package Hashing;

import java.util.*;

public class longestSequence {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(longest(nums));
    }

    public static int longest(int[] nums){

        HashSet<Integer> hash = new HashSet<>();

        for(int num : nums){
            hash.add(num);
        }

        int longest = 0;

        for(int num : hash){

            // Start only if it is the beginning of a sequence
            if(!hash.contains(num - 1)){

                int current = num;
                int count = 1;

                while(hash.contains(current + 1)){
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}