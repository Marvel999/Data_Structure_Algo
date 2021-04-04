package BasicJavaProblem;

import java.util.Scanner;

public class gcdLcm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int gc=findGcd(a,b);
        int lcm=(a*b/gc);
        System.out.println(gc);
        System.out.println(lcm);
    }
    public static int findGcd(int a,int b){
        if(a==0)
            return b;
        return findGcd(b%a,a);
    }
}
