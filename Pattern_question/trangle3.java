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
}
