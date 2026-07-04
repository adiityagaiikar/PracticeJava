package BinarySearch;

import java.util.*;

public class BinaryInRotated {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        sc.close();

        System.out.println(solve(arr, target));
    }

    public static int solve(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            // Left half is sorted
            if(arr[left] <= arr[mid]){

                if(target >= arr[left] && target < arr[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else{

                if(target > arr[mid] && target <= arr[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}