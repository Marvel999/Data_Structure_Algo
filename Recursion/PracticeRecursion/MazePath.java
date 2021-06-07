package PracticeRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {

    public static void main(String[] args) throws Exception {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> ba=new ArrayList<>();
            ba.add("");
            return ba;
        }

        if(sr>dr || sc>dc){
            ArrayList<String> oba=new ArrayList<>();
            return oba;
        }

        ArrayList<String> pathh=getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> pathv=getMazePaths(sr+1,sc,dr,dc);

        ArrayList<String> myAns=new ArrayList<>();

        for(int i=0;i<pathh.size();i++){
            myAns.add("h"+pathh.get(i));
        }

        for(int j=0;j<pathv.size();j++){
            myAns.add("v"+pathv.get(j));
        }

        return myAns;

    }
}
