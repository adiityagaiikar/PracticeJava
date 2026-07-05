package Strings;
import java.util.*;

public class reverseWords {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        String[] strs = reverse(s);
        for(String ss:strs){
            System.out.print(ss+" ");
        }
    }

    public static String[] reverse(String s){
        s=s.trim();
        String[] strs=s.split("\\s+");
        int left=0;
        int right=strs.length-1;
        while(left<right){
            String temp=strs[left];
            strs[left]=strs[right];
            strs[right]=temp;
            left++;
            right--;
        }
        return strs;
    }
}
