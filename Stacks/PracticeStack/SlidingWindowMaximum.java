package Stacks.PracticeStack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SlidingWindowMaximum {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        // code
        slidingWindowMax(a,k);

    }

    public static void slidingWindowMax(int[] arr,int k){
        int[] ngr=nextGraterRight(arr);
        int j=0;
        for(int i=0;i<=arr.length-k;i++){
            if(j<i)
                j=i;
            // i+k i'th window ending point
            while(ngr[j]<i+k)
                j=ngr[j];

            System.out.println(arr[j]);
        }
    }

    public static int[] nextGraterRight(int[] arr){
        int n=arr.length;
        int[] ngr=new int[n];
        ngr[n-1]=n;
        Stack<Integer> st=new Stack<>();
        st.push(n-1);

        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]<=arr[i]){
                st.pop();
            }

            if(st.size()==0){
                ngr[i]=n;
            }

            else{
                ngr[i]=st.peek();
            }
            st.push(i);
        }
        return ngr;
    }
}
