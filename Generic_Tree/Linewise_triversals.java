package Generic_Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Linewise_triversals {
    private static class Node {
        int data;
        ArrayList< Node > children = new ArrayList < > ();

        Node() {

        }
        Node(int d) {
            data = d;
        }
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child: node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child: node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack< Node > st = new Stack < > ();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static int size(Node node) {
        int s = 0;

        for (Node child: node.children) {
            s += size(child);
        }
        s += 1;

        return s;
    }

    public static int max(Node node) {
        int m = Integer.MIN_VALUE;

        for (Node child: node.children) {
            int cm = max(child);
            m = Math.max(m, cm);
        }
        m = Math.max(m, node.data);

        return m;
    }

    public static int height(Node node) {
        int h = -1;

        for (Node child: node.children) {
            int ch = height(child);
            h = Math.max(h, ch);
        }
        h += 1;

        return h;
    }

    public static void traversals(Node node) {
        System.out.println("Node Pre " + node.data);

        for (Node child: node.children) {
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traversals(child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }

        System.out.println("Node Post " + node.data);
    }

    public static void levelOrderLinewise(Node node) {
        Queue< Node > mq = new ArrayDeque< >();
        Node temp = new Node(-1);
        mq.add(node);
        mq.add(temp);

        while (mq.size() > 0) {
            node = mq.remove();

            if (node.data != -1) {
                System.out.print(node.data + " ");
                for (Node child: node.children) {
                    mq.add(child);
                }

            } else {
                if (mq.size() > 0) {
                    mq.add(new Node(-1));
                    System.out.println();

                }
            }
        }
    }

    // second approch

    public static void levelOrderLinewise2(Node node){
        Queue<Node> mq=new ArrayDeque<>();
        mq.add(node);
        Queue<Node> cq=new ArrayDeque<>();
        while(mq.size()>0){
            node=mq.remove();
            System.out.print(node.data+" ");

            for(Node child:node.children){
                cq.add(child);
            }

            if(mq.size()==0){
                mq=cq;
                cq=new ArrayDeque<>();
                System.out.println();
            }
        }

    }

    // third mathode
    public static void levelOrderLinewise3(Node node){
        Queue<Node> q=new ArrayDeque<>();
        q.add(node);
        while(q.size()>0){
            int ls=q.size();
            for(int i=0;i<ls;i++){
                node =q.remove();
                System.out.print(node.data+" ");
                for(Node child:node.children){
                    q.add(child);
                }
            }
            System.out.println();
        }

    }

    public static class Paire{
        Node node;
        int level;

        Paire(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }



    //4th mathode
   public static void levelOrderLinewise4(Node node){
       Queue<Paire> q=new ArrayDeque<>();
       q.add(new Paire(node,1));
       int level=1;
       while(q.size()>0){
           Paire p=q.remove();
           if(p.level>level){
               level=p.level;
               System.out.println();
           }
           System.out.print(p.node.data+" ");
           for(Node child:p.node.children){
               q.add(new Paire(child,p.level+1));
           }
       }

   }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        levelOrderLinewise(root);
    }
}
