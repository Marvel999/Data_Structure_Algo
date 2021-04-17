package NumberSystem;

public class AdditionOfAnyNumber {
    public static void main(String[] args) {

    }

    public static int getSum(int b, int n1, int n2){
        int pow=1;
        int ans=0;
        int carry=0;
        while(n1>0 || n2>0 || carry!=0){
            int d1=n1%10;
            int d2=n2%10;
            n1/=10;
            n2/=10;
            int sum=d1+d2+carry;
            int d=sum%b;
            carry=sum/b;
            ans+=d*pow;
            pow*=10;
        }

        return ans;
    }
}
