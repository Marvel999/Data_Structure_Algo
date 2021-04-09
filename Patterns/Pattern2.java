package Patterns;

import java.util.Scanner;

// "/t"=tab
public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // write ur code here
        int num=scn.nextInt();
        for(int i=num;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

