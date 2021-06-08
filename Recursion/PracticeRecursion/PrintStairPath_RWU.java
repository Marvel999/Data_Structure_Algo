package PracticeRecursion;

import java.util.Scanner;

public class PrintStairPath_RWU {
    public static void main(String[] args) throws Exception {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String path) {
        if(n==0)
        {
            System.out.println(path);
            return;
        }

        if(n-1>=0)
            printStairPaths(n-1,path+"1");
        if(n-2>=0)
            printStairPaths(n-2,path+"2");
        if(n-3>=0)
            printStairPaths(n-3,path+"3");

    }
}
