package PracticeRecursion;

import java.util.Scanner;

public class PrintKPC_OWU {
    public static String[] code={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        printKPC(s,"");
    }

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        String mycode=code[ch-'0'];

        for(int i=0;i<mycode.length();i++){
            char fc=mycode.charAt(i);
            printKPC(ros,asf+fc);
        }
    }
}
