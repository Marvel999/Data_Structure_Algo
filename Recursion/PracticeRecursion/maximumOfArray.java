package PracticeRecursion;

import java.util.Scanner;

public class maximumOfArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1)
            return arr[idx];

        int smax=maxOfArray(arr,idx+1);
        int max =Math.max(arr[idx], smax);
        return max;


    }
}
