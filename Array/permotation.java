package ArrayAndFunction;

import java.util.Scanner;

public class permotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int r=sc.nextInt();
        StringBuilder s=new StringBuilder("hiii");

        s.reverse();

//        System.out.println(n +"P"+r+" = "+fact(n)/fact(n-r));
        System.out.println();
    }

    private static int fact(int x){
        int np=1;
        for(int i=1;i<=x;i++){
            np *= i;

        }
        return np;
    }
}
