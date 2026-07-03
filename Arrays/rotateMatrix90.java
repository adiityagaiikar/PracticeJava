package Arrays;
import java.util.*;

public class rotateMatrix90 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        sc.close();

        transpose(mat, n);  

        reverse(mat, n);

for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
        System.out.print(mat[i][j] + " ");
    }
    System.out.println();
}   
    }

    public static void transpose(int mat[][],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }

    public static void reverse(int mat[][],int n){
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }
        
    }
}
