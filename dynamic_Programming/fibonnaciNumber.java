package dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class fibonnaciNumber {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] qb=new int[n+1];
        Arrays.fill(qb,-1);
        int nth=fib_tab(n);
        System.out.println(nth);
    }

    //Tabulation way to solve problem
    public static int fib_tab(int n){

        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];

        return dp[n];
    }

    //Memoization way to solve problem
    public static int fib_mem(int n,int[] qb){
        if(n==0 || n==1){
            qb[n]=n;
            return n;
        }

        if(qb[n]!= -1){
            return qb[n];
        }

        int fibn=fib_mem(n-1,qb)+fib_mem(n-2,qb);
        qb[n]=fibn;

        return fibn;
    }
}
