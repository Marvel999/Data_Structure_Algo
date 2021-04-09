package Patterns;

import java.util.Scanner;

public class Patter3 { public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int num=scn.nextInt();
    for(int i=1;i<=num;i++){
        for(int j=1;j<=num;j++){
            if(j<=num-i){
                System.out.print("	 ");
            }else{
                System.out.print("	*");
            }
        }
        System.out.println();
    }


}

public static void splitPattern(int n){
    for(int i=1;i<n;i++){
        int space=n-i;
        int star=i;
        for (int j=1;j<=space;j++){
            System.out.print("	 ");
        }
        for (int k=1;k<=star;k++) {
            System.out.print("	*");
            }
    }
}
}
