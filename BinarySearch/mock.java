

package BinarySearch;
import java.util.*;

public class mock {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] nums = line.split(" ");
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        int target=sc.nextInt();
        System.out.println(solve(arr,target));
        sc.close();
    }

    public static int solve(int arr[],int target){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(arr[left]<=arr[mid]){
                
            }
        }
        return -1;
    }
}

