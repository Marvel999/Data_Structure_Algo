package Stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
// comp. O(n)
// while loop not run every time
public class NGETR {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }
// right to left
    // put last index -1
    //  pop next step answer next step push
    public static int[] solve(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);

        String s;

        ans[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }

            st.push(arr[i]);
        }
        return ans;
    }

}
