package String;

import java.util.Scanner;

public class PrintAllSubString2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
//        String s1=scanner.next();
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }
}
