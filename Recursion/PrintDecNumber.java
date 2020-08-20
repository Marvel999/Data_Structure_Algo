package Recurssion_in_java;

public class PrintDecNumber {

    public static void main(String[] args)
    {
       printDec(10);
    }

    public  static  void printDec(int n){
        if(n==0)
            return;
        System.out.println(n);
        printDec(n-1);

    }
}
