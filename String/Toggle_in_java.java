package String;

import java.util.Scanner;

public class Toggle_in_java {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        System.out.println(modify(str));

    }
    public static String  togglechar(String str){
        StringBuilder stb=new StringBuilder(str);
        for(int i=0;i<stb.length();i++){
            char ch=stb.charAt(i);
            if(ch>='a' && ch <='z')
                ch=(char) (ch-'a'+'A');
            else
                ch=(char) (ch-'A'+'a');
            stb.setCharAt(i,ch);

        }
        return stb.toString();
    }

    public static String modify(String str){
        StringBuilder stb=new StringBuilder(str);
        for (int i=0; i<str.length();i++){
            char ch=stb.charAt(i);
            if(i%2==0)
                ch=(char)(ch+1);
            else
                ch=(char)(ch-1);
            stb.setCharAt(i,ch);
        }
          return stb.toString();
    }
}
