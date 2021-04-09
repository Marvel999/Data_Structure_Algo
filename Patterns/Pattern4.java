package Patterns;

import java.util.Scanner;

public class Pattern4 {


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            // write ur code here
            int num=scn.nextInt();
            for(int i=num;i>0;i--){
                int star=i;
                int space=num-i;
                for(int j=1;j<=space;j++){
                    System.out.print("\t");
                }
                for(int j=1;j<=star;j++){
                    System.out.print("*\t");
                }
                System.out.println();
            }

        }

    public static void mathode() {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>j){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }

            }

            System.out.println();
        }

    }

}
