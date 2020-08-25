package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class NGETL {
    public static int[] nget(int[] arr){

        Stack<Integer> st=new Stack<>();
        nget(arr);
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] ans= new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nget(arr);
    }
}
