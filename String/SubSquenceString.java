package String;

import java.util.Scanner;

public class SubSquenceString {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        subsequence(str);

    }
    public static void subsequence(String str){
        for (int i=0;i<(1<<str.length());i++){
            for (int j=str.length()-1;j>=0;j--){
                int mask=1<<j;
                if((i & mask)!=0)
                    System.out.print(str.charAt(str.length()-1-j));
            }
            System.out.println();
        }

    }
}
