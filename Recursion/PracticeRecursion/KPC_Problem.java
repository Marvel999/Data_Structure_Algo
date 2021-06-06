package PracticeRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KPC_Problem {
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();
        ArrayList<String> list=getKPC(str);
        System.out.println(list);
    }

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> ba=new ArrayList<>();
            ba.add("");
            return ba;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> list=getKPC(ros);
        ArrayList<String> myAns=new ArrayList<>();
        String key=codes[ch - '0'];
        for(int i=0;i<key.length();i++){
            for(int j=0;j<list.size();j++){
                String outStr=key.charAt(i)+list.get(j);
                myAns.add(outStr);
            }
        }
        return myAns;
    }

}
