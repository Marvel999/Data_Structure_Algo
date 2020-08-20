package Recurssion_in_java;

public class printIncNumber {

    public static void main(String[] args){
printInc(5);
    }
    public static void printInc(int n){

            if(n==0){
                return;
            }
        printInc(n-1);
        System.out.println(n);

    }
}
