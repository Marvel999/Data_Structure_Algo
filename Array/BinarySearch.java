package ArrayAndFunction;

import java.util.Scanner;

public class BinarySearch  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        int l=0;
        int h=n-1;
        while (l<=h){
       int m=(l+h)/2;
       if(data>arr[m]){
           l=m+1;
       }
       else if(data<arr[m]){
           l=m-1;
       }
       else{
           System.out.println(m);
           return;  // it will not go into tj -1 statement.
       }
        }
       System.out.println(-1);
    }
}
