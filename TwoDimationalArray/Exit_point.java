package TwoDimationalArray;

import java.util.Scanner;

public class Exit_point {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        int arr[][]=new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        printExitPoint(arr);

    }

    public static void printExitPoint(int[][] arr){
        int r=0;
        int c=0;
        int dir=0;
        while(c>=0 &&  c<arr[0].length && r>=0 && r<arr.length){

            dir=(dir+arr[r][c])%4;

            if(dir==0){
                c++;
                if(c==arr[0].length){
                    c--;
                    break;
                }
            }
            else if(dir==1){
                r++;
                if(r==arr.length){
                    r--;
                    break;
                }
            }else if(dir==2){
                c--;
                if(c==-1){
                    c++;
                    break;
                }
            }
            else {
                r--;

                if(r==-1){
                    r++;
                    break;
                }
            }
        }

        System.out.println(r);
        System.out.println(c);

    }
}
