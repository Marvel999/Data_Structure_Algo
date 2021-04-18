package BasicJavaProblem;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        System.out.println(factorial(n));
    }

    public static BigInteger factorial(int n){
        BigInteger fact= new BigInteger("1");
        for(int i=n;i>0;i--)
            fact=fact.multiply(BigInteger.valueOf(i));

        return fact;


    }


}
