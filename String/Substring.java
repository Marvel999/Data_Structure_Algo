package String;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        for (int i=0;i<input.length();i++){
            System.out.println(input.charAt(i));
        }
        subset(input);
    }
//    n(n+1)/2 with empty space n(n+1)/2+1;
    public  static void  subset( String  s){
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
