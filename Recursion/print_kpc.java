package Recurssion_in_java;

import java.util.Scanner;

public class print_kpc {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        printKPC(s,"");
    }
    public static String[] charcode={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String qor=str.substring(1);

        String stringcode=charcode[ch-'0'];

        for(int i=0;i<stringcode.length();i++){
            printKPC( qor, ans+stringcode.charAt(i));
        }



    }

}
