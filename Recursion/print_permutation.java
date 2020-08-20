package Recurssion_in_java;

import java.util.Scanner;

public class print_permutation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        printPermutations(s,"");
    }

    public static void printPermutations(String str, String ps) {
        if(str.length()==0){
            System.out.println(ps);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);
            printPermutations(ros,ps+ch);
        }
    }

}
