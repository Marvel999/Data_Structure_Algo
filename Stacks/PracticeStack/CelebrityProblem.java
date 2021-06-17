package Stacks.PracticeStack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CelebrityProblem {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
            if(arr[i][j]==0)
                j--;
            else
                i++;
        }

        int pc=i;
        //row check
        for(int c=0;c<n;c++){
            if(c!=pc && arr[pc][c]!=0){
                System.out.println("none");
                return;
            }
        }


        //colom check
        for(int r=0;r<n;r++){
            if(r!=pc && arr[r][pc]==0){
                System.out.println("none");
                return;
            }
        }

        System.out.println(pc);
    }
}
