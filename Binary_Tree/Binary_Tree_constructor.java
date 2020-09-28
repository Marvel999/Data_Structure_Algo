package Binary_Tree;


import java.util.Stack;

public class Binary_Tree_constructor {
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
    public static class Paire{
        int state;
        Node node;
        Paire(Node node,int state){
            this.node=node;
            this.state=state;
        }


    }
    public static Node contructore(int[] arr){
        Node root=new Node(arr[0],null,null);
        Stack<Paire> st=new Stack<>();
        Paire pr=new Paire(root,1);
        st.push(pr);
        int idx=1;
        while (st.size()>0 && idx<arr.length){
            Paire top=st.peek();
            if (top.state==1){

                if(arr[idx]!=-1){
                    top.node.left=new Node(arr[idx],null,null);

                   Paire lp=new Paire(top.node.left,1);
                   st.push(lp);

                }else {
                    top.node.left=null;
                }
                top.state++;
                idx++;
            }else if(top.state==2){

                if(arr[idx]!=-1){
                    top.node.right=new Node(arr[idx],null,null);
                    Paire rp=new Paire(top.node.right,1);
                    st.push(rp);

                }else {
                    top.node.right=null;
                }
                top.state++;
                idx++;
            }else{
              st.pop();
            }
        }
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
       Node root= contructore(arr);
       Display(root);
    }
}
