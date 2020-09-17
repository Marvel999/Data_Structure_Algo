package TwoDimationalArray;

import java.util.Scanner;

public class Spiral_Display {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int minc=0;
        int minr=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;

        int tem=m*n;
        int ele=0;
        while(ele<tem){

            //left well

            for(int i=minr,j=minc;i<=maxr && ele<tem;i++){
                System.out.println(arr[i][j]);
                ele++;
            }
            minc++;

            //bottom well


            for(int i=maxr,j=minc;j<=maxc && ele<tem;j++){
                System.out.println(arr[i][j]);
                ele++;
            }
            maxr--;

            //right well

            for(int i=maxr,j=maxc;i>=minr && ele<tem;i--){
                System.out.println(arr[i][j]);
                ele++;
            }
            maxc--;



            //top well

            for(int i=minr,j=maxc;j>=minc && ele<tem;j--){
                System.out.println(arr[i][j]);
                ele++;
            }
            minr++;

        }
    }
}
