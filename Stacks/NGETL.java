package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class NGETL {

// answer, pop, push
    // left to right
    public static int[] solve(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                int pos=st.peek();
                ans[pos]=arr[i];
                st.pop();

            }
            st.push(i);
        }

        while(st.size()>0){
            int pos=st.peek();
            ans[pos]=-1;
            st.pop();
        }
        return ans;
    }

}
