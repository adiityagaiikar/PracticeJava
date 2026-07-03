package Sorting;

import java.util.*;

public class quickSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();

        quickSort1(nums, 0, n - 1);

        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort1(int[] nums, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(nums, low, high);

            quickSort1(nums, low, pivotIndex - 1);
            quickSort1(nums, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {

        int pivot = nums[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, high);

        return i + 1;
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}