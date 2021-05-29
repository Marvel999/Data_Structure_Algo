package PracticeRecursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int n=scan.nextInt();
        int xn=power(x,n);
        System.out.println(xn);
    }

    public static int power(int x, int n){
        if(n==0)
            return 1;
        int xnm=power(x,n-1);
        int xn=xnm*x;
        return xn;
    }
}
