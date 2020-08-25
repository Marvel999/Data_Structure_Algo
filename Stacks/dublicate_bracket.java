package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class dublicate_bracket {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isWhitespace(ch)){
                System.out.println("white");
            }else{
                if(ch==')'){
                    if(st.peek()=='('){
                        System.out.println(true);
                        return;
                    }else{
                        while(st.peek() != '('){
                            //  System.out.println("pop "+st.peek());
                            st.pop();
                        }
                        //   System.out.println("pop "+st.peek());
                        st.pop();
                    }
                }else{
                    //  System.out.println(ch);
                    st.push(ch);
                }
            }


        }
        System.out.println(false);
    }
}
