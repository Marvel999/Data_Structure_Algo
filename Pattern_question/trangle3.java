package Pattern;

import java.util.Scanner;

public class trangle3 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=n;i>=0;i--){
            for(int j=0;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void trangle1(int n){
        int spc=n-1;
        int stc=1;
        for(int r=1;r<=n;r++){

            for(int i=1;i<=spc;i++){
                System.out.print("\t");
            }

            for(int i=1;i<=stc;i++){
                System.out.print("*\t");
            }
            System.out.println();
            spc--;
            stc++;

        }
    }
    public static void trangle2(int n){
        for(int c=1;c<=n;c++){
            for(int r=1;r<=n;r++){
                if(r+c<n+1)
                    System.out.print("\t");
                else
                    System.out.print("*\t");


            }
            System.out.println();
        }
    }
}
