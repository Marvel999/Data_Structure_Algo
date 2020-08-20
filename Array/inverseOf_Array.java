package ArrayAndFunction;

import java.util.Scanner;

public class inverseOf_Array {
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int arr1[]=new int[n];
//        arr1[0]=arr[n-1];
//        for (int i=1;i<n;i++){
//            arr1[i]=arr[i-1];
//        }
//        int temp;
//        for (int i=0 ;i<(n-2)/2;i++){
//            temp=arr1[i+2];
//            arr1[i+2]=arr1[n-1-i];
//            arr1[n-1-i]=temp;
//        }
//        for (int i=0;i<n;i++){
//            System.out.println(arr1[i]);
//        }
//



        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking input
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[n];
        // inverse
        for (int i=0;i<n;i++){
            arr1[arr[i]]=i;
        }
        // output
        for (int i=0;i<n;i++){
            System.out.println(arr1[i]);
        }

    }

}
