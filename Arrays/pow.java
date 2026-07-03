package Arrays;

public class pow {
    public static int fastexp(int base,int exp){
        int ans=1;
        while(exp>0){
            if(exp%2==1){
                ans=ans*base;
            }
            base=base*base;
            exp/=2;
        }
        return ans;
    }
}
