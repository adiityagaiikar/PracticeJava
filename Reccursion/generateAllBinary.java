package Reccursion;

public class generateAllBinary {
    public static void binary(int n,String current){
        if(current.length()==n){
            System.out.println(current);
            return;
        }

        //take 0
        binary(n,current+"0");

        //take 1
        binary(n,current+"1");
    }
}
