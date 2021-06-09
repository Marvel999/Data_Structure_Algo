package PracticeRecursion;

import java.util.Scanner;

public class Encoding_ROWUP {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        printEncodings(str,"");
    }

    public static void printEncodings(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        char ch=str.charAt(0);

        if(ch=='0'){
            return;
        }

        String ros=str.substring(1);
        char fi=(char)(((ch-'0')-1)+'a');
        printEncodings(ros,asf+fi);

        if(str.length()>=2){
            int val=(str.charAt(0)-'0')*10+(str.charAt(1)-'0');

            if(val>=10 && val<=26){
                char fi2=(char)(val-1+'a');
                String ros2=str.substring(2);
                printEncodings(ros2,asf+fi2);
            }
        }
    }
}
