package SlidingWindow;
import java.util.*;

public class maxVowels {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        sc.close();
        System.out.println(maxVowels1(s,k));
    }

    public static int maxVowels1(String s,int k){
        s=s.toLowerCase();
        int count=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<k;i++){
            if(isVowel(ch[i])){
                count++;
            }
        }

        int maxCount=count;

        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))){
                count--;
            }

            if(isVowel(s.charAt(i))){
                count++;
            }

            if(count>maxCount){
                maxCount=count;
            }
        }
        return maxCount;
    }

    public static boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
