package PracticeRecursion;

import java.util.Scanner;

public class LograthamicPower {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int n=scan.nextInt();
        int xn=power(x,n);
        System.out.println(xn);

    }

    public static int power(int x, int n){
        if(n==0)
            return 1;

        int xnbt=power(x,n/2);
        int xn=xnbt*xnbt;
        if(n%2==1)
            xn=x*xn;

        return xn;
    }

}
