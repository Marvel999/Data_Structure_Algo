package NumberSystem;

import java.util.Scanner;

public class AnyBaseMultipication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2){


        int pow1=1;
        int ans=0;

        while(n2!=0){
            int d2=n2%10;
            n2/=10;
            int mul=singleDigitMul(d2,n1,b);
            ans=getSum(b,ans,mul*pow1);
            pow1*=10;
        }
        return ans;


    }


    public static int singleDigitMul(int d2,int n1,int b){
        int carry=0;
        int pow=1;
        int res=0;
        while(n1!=0 || carry>0){
            int d1=n1%10;
            n1/=10;
            int mul=(d1*d2)+carry;
            int digit=mul%b;
            carry=mul/b;
            res+=digit*pow;
            pow*=10;
        }

        return res;
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
