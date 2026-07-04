package Greedy;
import java.util.*;

public class AssignCookies {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cookies[]=new int[n];
        for(int i=0;i<cookies.length;i++){
            cookies[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int student[]=new int[m];
        for(int i=0;i<student.length;i++){
            student[i]=sc.nextInt();
        }
        sc.close();

        //
        System.out.println(solve(student,cookies));
    }

    public static int solve(int student[],int cookies[]){
        Arrays.sort(student);
        Arrays.sort(cookies);

        int left=0;
        int right=0;
        int count=0;

        while(left<cookies.length && right<student.length){
            if(student[right]>=cookies[left]){
                right++;
                left++;
                count++;
            }else{
                right++;
            }
            
        }
        return count;
    }
}