package BasicJavaProblem;

import java.util.Scanner;

public class fibonacciProblem {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int num =scan.nextInt();
        int a=0;
        int b=1;
        if (num<=1){
            System.out.println("Not valid input");
        }
      else {
           fibonacciNumber(num);
        }


    }

    public static void fibonacciNumber1(int num){
        int a=0;
        int b=1;
        for (int i=1;i<=num;i++){
            if (i==1)
                System.out.println(a);
            if (i==2)
                System.out.println(b);
            if (i>=3){
                int c=a+b;
                a=b;
                b=c;
                System.out.println(c);
            }
        }
    }

    // best practice of fibonacciNumber
    public static void fibonacciNumber(int n){
        int a=0;
        int b=1;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
