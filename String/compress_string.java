package String;

import java.util.Scanner;

public class compress_string {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        System.out.println(compress(str));

    }
    public static String compress(String str){
        StringBuilder stb=new StringBuilder();
        int i=0;
        int count=1;
        while (i<str.length()-1){
            if(str.charAt(i)==str.charAt(i+1)){
              i++;
              count++;
            }else if(count==1) {
                char ch=str.charAt(i);
                stb.append(ch);
                count=1;
                i++;
            }else {
                char ch=str.charAt(i);
                stb.append(ch);
                stb.append(count);
                count=1;
                i++;
            }
        }
        stb.append(str.charAt(str.length()-1));
        stb.append(count);
        return stb.toString();
    }
}
