package BasicMaths;
import java.util.*;

public class decimalToBinary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println(toBinary(num));
    }

    public static String toBinary(int num){
        String binary=" ";
        while(num>0){
            int rem=num%2;
            binary=rem+binary;
            num=num/2;
        }
        return binary;
    }
}
