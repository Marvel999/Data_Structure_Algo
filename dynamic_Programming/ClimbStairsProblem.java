package dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbStairsProblem {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] pq=new int[n+1];
        Arrays.fill(pq,-1);
        System.out.println(cs_tab(n));
    }

    public static int cs_tab(int n){
        int[] dp=new int[n+1];

        dp[0]=1;

        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }

        return dp[n];
    }

    public static int cs_meam(int n, int[] pq){
        if(n==0){
            return 1;
        }

        int ways=0;

        if(pq[n]!=-1){
            return pq[n];
        }

        if((n-1)>=0){
            ways+=cs_meam(n-1,pq);
        }
        if((n-2)>=0){
            ways+=cs_meam(n-2,pq);
        }
        if((n-3)>=0){
            ways+=cs_meam(n-3,pq);
        }

        pq[n]=ways;

        return ways;

    }
}
