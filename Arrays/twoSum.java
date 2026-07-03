package Arrays;
import java.util.*;

public class twoSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        sc.close();

        int[] result=twosum(nums,target);
        for(int x:result){
            System.out.println(x+" ");
        }
    }

    public static int[] twosum(int [] nums,int target){
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(hash.containsKey(compliment)){
                return new int[]{hash.get(compliment),i};
            }
            hash.put(nums[i],i);
        }
        return new int[]{};
    }
}
