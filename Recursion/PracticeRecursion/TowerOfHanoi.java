package PracticeRecursion;

import java.util.Scanner;

public class TowerOfHanoi {


    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        toh(n,n1,n2,n3);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){

        if(n==0)
            return;

        toh(n-1,t1id,t3id,t2id);
        System.out.println(n+"["+t1id+" -> "+t2id+"]");
        toh(n-1,t3id,t2id,t1id);

    }
}
