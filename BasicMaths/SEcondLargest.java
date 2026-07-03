package BasicMaths;
import java.util.*;

public class SEcondLargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        sc.close();
        
    }

    private static int second(int nums[]) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num: nums){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        return secondLargest;
    }
}
