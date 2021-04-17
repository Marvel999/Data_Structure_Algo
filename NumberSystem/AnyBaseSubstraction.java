package NumberSystem;

public class AnyBaseSubstraction {
    public static void main(String[] args) {

    }

    public static int getDifference(int b, int n1, int n2){
        // write your code here

        int ans=0;
        int pow=1;
        int borrow=0;

        while(n2>0){
            int d1=n1%10;
            int d2=n2%10;

            n1/=10;
            n2/=10;

            int sub=(d2+borrow)-d1;
            int d=sub;
            if(sub<0){
                d+=b;
                borrow=-1;
            }else{
                borrow=0;
            }



            ans+=d*pow;

            pow*=10;

        }

        return ans;
    }
}
