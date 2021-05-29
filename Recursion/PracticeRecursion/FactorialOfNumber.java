package PracticeRecursion;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==0)
            return 1;

        int fact=n*factorial(n-1);
        return fact;
    }

}
