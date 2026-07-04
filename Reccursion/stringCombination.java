package Reccursion;
import java.util.*;

public class stringCombination {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean visited[]=new boolean[str.length()];
        solve(str,"",visited);
        sc.close();
    }

    public static void solve(String str,String current,boolean[] visited){
        if(current.length() == str.length()){
    System.out.println(current);
    return;
}

        for(int i=0;i<str.length();i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            solve(str,current+str.charAt(i),visited);
            visited[i]=false;
        }
    }
}
