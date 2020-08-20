package ArrayAndFunction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class rotationOfArray {
    public static  void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int n1=sc.nextInt();

        for (int i=0;i<n;i++){
            int tamp=arr[t+1];
            int temp1;
           if(i==0){
               tamp=arr[t];
           }
           else{
            if(t<n-1){
//                Collections.reverse(Arrays.asList(arr));
                temp1=arr[i];
               arr[t+1]=tamp;
               tamp=temp1;
            }
            if(t==n-1){
                t=0;
            }
           }

            t++;
        }

    }
}
