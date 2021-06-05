package PracticeRecursion;

import java.util.Scanner;

public class PrintLastIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        int x=scan.nextInt();
        int li=lastIndex(arr,0,x);
        System.out.println(li);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length)
            return -1;

        int lis=lastIndex(arr,idx+1,x);
        if(lis!=-1)
            return lis;
        else if(arr[idx]==x)
            return idx;
        else
            return -1;

    }
}
