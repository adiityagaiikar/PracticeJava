package BinarySearch;
import java.util.*;

class fitstandlastposn{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        sc.close();

        int[] result=solve(nums,target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] solve(int nums[],int target){
        int first=find1st(nums,target);
        int second=find2nd(nums,target);
        return new int[]{first,second};
    }

    public static int find1st(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-11;
            }
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }
        }
        return ans;
    }

    public static int find2nd(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }
        }
        return ans;
    }
}