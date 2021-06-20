package Stacks.PracticeStack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SmallNumberFollowingPattern {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // code
        printIncDec(str);
    }

    public static void printIncDec(String str) {
        Stack<Integer> st=new Stack<>();
        int val=1;
        for(int i=0 ; i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='d'){
                st.push(val);
                val++;
            }else{
                st.push(val);
                val++;
                print(st);
            }

        }

        st.push(val);
        val++;
        print(st);
    }

    public static void print(Stack<Integer> st){
        while(st.size()!=0){
            System.out.print(st.pop());
        }
    }
}
