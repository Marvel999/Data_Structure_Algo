package Stacks.PracticeStack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapter {

    public static class QueueToStackAdapter1 {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter1() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            // write your code here
            return mainQ.size();
        }

        void push(int val) {
            // write your code here
            mainQ.add(val);
        }

        int pop() {
            if(mainQ.size()==0){
                System.out.println("stack underflow");
                return -1;
            }
            // write your code here
            while(mainQ.size()!=1){
                helperQ.add(mainQ.remove());
            }
            int val =mainQ.remove();
            mainQ=helperQ;
            helperQ=new ArrayDeque<>();
            return val;

        }


        int top() {
            if(mainQ.size()==0){
                System.out.println("stack underflow");
                return -1;
            }
            // write your code here
            while(mainQ.size()!=1){
                helperQ.add(mainQ.remove());
            }
            int val =mainQ.remove();
            helperQ.add(val);
            mainQ=helperQ;
            helperQ=new ArrayDeque<>();
            return val;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        QueueToStackAdapter1 st = new QueueToStackAdapter1();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            }
            str = br.readLine();
        }
    }
}
