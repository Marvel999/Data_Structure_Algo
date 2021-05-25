package TwoDimationalArray;

import java.util.Scanner;

public class Rotate_ninty_degree {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }




        matRotation(arr);

        display(arr);
    }

    public static void matrixTran(int[][] arr){
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    public static void collomReversal(int[][] arr){
        int lo=0;
        int n=arr.length;
        int hi=n-1;

        while(lo<hi){
            for(int i=0;i<n;i++){
                int temp=arr[i][lo];
                arr[i][lo]=arr[i][hi];
                arr[i][hi]=temp;
            }

            lo++;
            hi--;
        }

    }


    public static void matRotation(int[][] arr){
        matrixTran(arr);
        collomReversal(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
