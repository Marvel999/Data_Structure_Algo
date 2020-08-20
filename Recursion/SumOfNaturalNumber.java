package Recurssion_in_java;

public class SumOfNaturalNumber {
    public static void main(String[] args){
        System.out.println(sum(3));
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }

        return n+sum(n-1);

    }
}
