package Greedy;

import java.util.*;

public class lemonade {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(solve(nums));
    }

    public static boolean solve(int[] nums){

        int five = 0;
        int ten = 0;

        for(int bill : nums){

            if(bill == 5){
                five++;
            }

            else if(bill == 10){

                if(five > 0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }

            else{

                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }
                else if(five >= 3){
                    five -= 3;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }
}