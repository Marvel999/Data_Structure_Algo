package Recurssion_in_java;

public class PrintIncDecJava {

    public static void main(String[] args){
        paintIncDec(5);
    }

    public static void paintIncDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        paintIncDec(n-1);
        System.out.println(n);
    }
}

