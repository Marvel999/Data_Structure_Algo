package Recurssion_in_java;

import java.util.Scanner;

public class print_encoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        printEncodings(s,"");
    }

    public static void printEncodings(String str,String psf) {

        if(str.length()==0){
            System.out.println(psf);
            return;
        }
        else if(str.length()==1){
            char ch=str.charAt(0);
            if(ch=='0'){
                return;
            }else{
                int chv=ch-'0';
                char chc=(char)('a'+chv-1);
                psf=psf+chc;
                System.out.println(psf);
            }
        }
        else{
            char ch=str.charAt(0);
            String ros=str.substring(1);
            if(ch=='0'){
                return;
            }else{
                int chv=ch-'0';
                char chc=(char)('a'+chv-1);
                printEncodings(ros,psf+chc);
            }


            String ch1=str.substring(0,2);
            String ros1=str.substring(2);

            int chv1=Integer.parseInt(ch1);

            if(chv1<=26){
                char chc1=(char)('a'+chv1-1);
                printEncodings(ros1,psf+chc1);
            }

        }


    }
}
