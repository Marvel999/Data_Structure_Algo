package PracticeRecursion;

import java.util.Scanner;

public class PrintZig_Zag {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0)
            return;

        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
    }
}
