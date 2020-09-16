package String;

import java.util.Scanner;

public class Print_subsquence_palindrom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
       palindromicss(input);
    }
    public  static void palindromicss(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
           String s=str.substring(i,j);
           boolean isPalindrom=isPalindrom(s);
           if(isPalindrom)
               System.out.println(s);
            }
        }
    }
    public static boolean isPalindrom(String str){
        int first=0;
        int last=str.length()-1;
        while (first<last){
            if (str.charAt(first)==str.charAt(last)){
                first++; last--;
            }
            else
                return false;
        }
        return true;
    }
}
