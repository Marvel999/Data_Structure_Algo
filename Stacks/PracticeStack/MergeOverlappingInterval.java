package Stacks.PracticeStack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingInterval {
    public static class Interval implements Comparable<Interval>{
        int st;
        int et;

        public Interval(int st, int et){
            this.st=st;
            this.et=et;
        }
        public Interval(){

        }

        //+ve -> this>o
        //-ve -> this<0
        //0 -> this==0

        public int compareTo(Interval o){
            if(this.st<o.st){
                return -1;
            }
            else if(this.st>o.st){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time

        int n= arr.length;
        Interval[] intv=new Interval[n];
        for(int i=0;i<n;i++){
            int ist=arr[i][0];
            int iet=arr[i][1];
            intv[i]=new Interval(ist,iet);
        }

        Arrays.sort(intv);

        Stack<Interval> st=new Stack<>();
        st.push(intv[0]);

        for(int i=1;i<n;i++){
            Interval curr= intv[i];
            Interval top=st.peek();

            if(curr.st<=top.et){
                top.et=Math.max(top.et,curr.et);
            }
            else{
                st.push(curr);
            }

        }


        //print ans
        Stack<Interval> temp=new Stack<>();


        while(st.size()>0){
            temp.push(st.pop());
        }

        while(temp.size()>0){
            Interval top=temp.pop();
            System.out.println(top.st+" "+top.et);
        }
    }
}
