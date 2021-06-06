package PracticeRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> ba=new ArrayList<>();
            ba.add("");
            return ba;
        }


        if(n<0){
            ArrayList<String> ba=new ArrayList<>();
            return ba;
        }

        ArrayList<String> path1=getStairPaths(n-1);

        ArrayList<String> path2=getStairPaths(n-2);

        ArrayList<String> path3=getStairPaths(n-3);

        ArrayList<String> myAns=new ArrayList<>();

        for(int i=0;i<path1.size();i++)
            myAns.add("1"+path1.get(i));

        for(int i=0;i<path2.size();i++)
            myAns.add("2"+path2.get(i));

        for(int i=0;i<path3.size();i++)
            myAns.add("3"+path3.get(i));


        return myAns;
    }
}
