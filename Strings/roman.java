package Strings;

import java.util.Scanner;

public class roman {   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(roman1(s));
    }

    public static int roman1(String s){
        char ch[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++){
            int current=value(ch[i]);
            if(i<s.length()-1 && current<value(ch[i+1])){
                sum=sum-current;
            }else{
                sum=sum+current;
            }
        }
        return sum;
    }

    public static int value(char ch){
        if(ch=='I')return 1;
        if(ch=='V')return 5;
        if(ch=='X')return 10;
        if(ch=='C')return 100;
        if(ch=='D')return 500;
        if(ch=='M')return 1000;
        return -1;
    }
}
