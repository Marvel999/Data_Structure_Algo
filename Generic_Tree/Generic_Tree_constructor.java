package Generic_Tree;

import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Generic_Tree_constructor {
    private static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        Node root;
        Stack<Node> st=new Stack<>();

        for (int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }else {
                Node temp=new Node();
                temp.data=arr[i];

                if(st.size()>0){
                   st.peek().children.add(temp);
                }else {
                  root=temp;
                }
                st.push(temp);
            }
        }

    }
}
