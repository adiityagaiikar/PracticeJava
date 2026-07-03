package BasicMaths;

public class fastExpo {
    public static int exponential(int base,int exp){
        int ans=1;
        while(exp>0){
            if(exp%2==1){
                ans=ans*base;
            }
            base=base*base;
            exp=exp/2;
        }
        return ans;
    }
}
