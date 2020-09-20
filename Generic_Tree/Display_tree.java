package Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Display_tree {
    private static class Node{
        int data;
        ArrayList<Display_tree.Node> children=new ArrayList<>();
    }

    public static void display(Node node){
        System.out.print(node.data+" -> ");
        for (Node node1:node.children){
            System.out.print(node1.data+",");
        }
        System.out.println(".");
        for (Node node1:node.children){
            display(node1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        Display_tree.Node root=null;
        Stack<Display_tree.Node> st=new Stack<>();

        for (int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }else {
                Display_tree.Node temp=new Display_tree.Node();
                temp.data=arr[i];

                if(st.size()>0){
                    st.peek().children.add(temp);
                }else {
                    root=temp;
                }
                st.push(temp);
            }
        }
        display(root);
    }
}
