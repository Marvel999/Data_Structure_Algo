package PracticeRecursion;

import java.util.Scanner;

public class PermotationString_OWUP {

    public static void main(String[] args) throws Exception {
        Scanner scan =new Scanner(System.in);
        String str=scan.next();
        printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1,str.length());

            printPermutations(ros,asf+ch);
        }
    }
}
