package String;

import java.util.Scanner;

public class PlindromProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        if(isPalindrom(input))
            System.out.println("String is palindrom");
        else
            System.out.println("String is not palindrom");
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
