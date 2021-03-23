package Stacks;
// Redundant Parentheses Problem

import java.util.Scanner;
import java.util.Stack;

public class RedundantParentheses {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        Stack<Character> stack=new Stack<Character>();
        s=sc.nextLine();
        boolean t=false;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='('){
                stack.push(ch);
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
                stack.push(ch);
            }
            else if (ch==')'){
                if (stack.peek()=='('){
                    t=true;
                }else {
                while (stack.peek()=='+' || stack.peek()=='-' || stack.peek()=='*' || stack.peek()=='/' || stack.peek()=='%'){
                    stack.pop();
                }
                stack.pop();
            }
            }
        }

        if (t){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
