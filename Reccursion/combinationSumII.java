package Reccursion;

import java.util.*;

public class combinationSumII {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        sc.close();

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        solve(0, nums, target, new ArrayList<>(), ans);

        System.out.println(ans);
    }

    public static void solve(int index, int[] nums, int target,
                             ArrayList<Integer> list,
                             List<List<Integer>> ans){

        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < nums.length; i++){

            if(i > index && nums[i] == nums[i - 1]){
                continue;
            }

            if(nums[i] > target){
                break;
            }

            list.add(nums[i]);

            solve(i + 1, nums, target - nums[i], list, ans);

            list.remove(list.size() - 1);
        }
    }
}