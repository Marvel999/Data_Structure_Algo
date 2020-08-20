package Recurssion_in_java;

public class BoxPath {
    public static void main(String [] args){
      System.out.println(box(3,2));
    }

    public static int box(int m,int n){
        if(m==1 || n==1){
            return 1;
        }
        return box(m-1,n)+box(m,n-1);
    }
}
