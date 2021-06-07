package PracticeRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazeJump {

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
            ArrayList<String> ba= new ArrayList<>();
            ba.add("");
            return ba;

        }


        ArrayList<String> myAns= new ArrayList<>();

        for(int i=1;sc+i<=dc;i++){
            ArrayList<String> pathh=getMazePaths(sr,sc+i,dr,dc);
            for(int j=0;j<pathh.size();j++)
                myAns.add("h"+i+pathh.get(j));

        }

        for(int i=1;sr+i<=dr;i++){
            ArrayList<String> pathv=getMazePaths(sr+i,sc,dr,dc);
            for(int j=0;j<pathv.size();j++)
                myAns.add("v"+i+pathv.get(j));

        }

        for(int i=1;sr+i<=dr && sc+i<=dc;i++){
            ArrayList<String> pathd=getMazePaths(sr+i,sc+i,dr,dc);
            for(int j=0;j<pathd.size();j++)
                myAns.add("d"+i+pathd.get(j));

        }
        return myAns;
    }
}
