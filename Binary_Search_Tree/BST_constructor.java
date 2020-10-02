package Binary_Search_Tree;


import java.util.Stack;

public class BST_constructor {
    public static class Node{
        int data;
       Node left;
       Node right;
        Node(int data, Node left, Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    public static Node contructore(int[] arr ,int lo,int hi){
        if(lo>hi){
            return  null;
        }
        int mid=(lo+hi)/2;
        int data=arr[mid];
        Node lc=contructore(arr,lo,mid-1);
        Node rc=contructore(arr,mid+1,hi);
        Node root=new Node(data,lc,rc);
        return root;
    }

    public static void Display(Node root){
        if(root==null){
            return;
        }
        String st="";
        st +=root.left==null?".": String.valueOf(root.left.data);
        st +=" <-- ";
        st += root.data;
        st +=" --> ";
        st +=root.right==null?".": String.valueOf(root.right.data);

        System.out.println(st);
         Display(root.left);
         Display(root.right);

    }

    public static void main(String[] args) {
        int[] arr= {50,25,12,-1,-1,37,30,-1,-1,75,62,-1,70,-1,-1,87,-1,-1};
       Node root= contructore(arr,0,arr.length-1);
       Display(root);
    }

}
