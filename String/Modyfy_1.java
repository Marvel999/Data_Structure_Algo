package String;

import java.util.Scanner;

public class Modyfy_1 {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        System.out.println(modify2(str));

    }
    public static String modify2(String str){
        StringBuilder stb=new StringBuilder();
        for (int i=0;i<str.length()-1;i++){
           char ch1=str.charAt(i);
           char ch2=str.charAt(i+1);
           int deff=ch2-ch1;
           stb.append(ch1);
           stb.append(deff);
        }
        stb.append(str.charAt(str.length()-1));
    return stb.toString();
    }
}
