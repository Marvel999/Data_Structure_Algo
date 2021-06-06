package PracticeRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        String s=scan.nextLine();
        System.out.println(gss(s));

    }

    public static ArrayList<String> gss(String str) {

        if(str.length()==0){
            ArrayList<String> ba=new ArrayList<>();
            ba.add("");
            return ba;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> rans=gss(ros);
        ArrayList<String> myans= new ArrayList<>();

        //ch-> no choice
        for(int i=0;i<rans.size();i++){
            myans.add(rans.get(i));
        }

        //ch->yes choice
        for(int i=0;i<rans.size();i++){
            myans.add(ch+rans.get(i));
        }

        return myans;
    }
}
