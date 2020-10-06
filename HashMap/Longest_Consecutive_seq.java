package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Longest_Consecutive_seq {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Boolean> hm=new HashMap();

        for(int i=0;i<n;i++){
            hm.put(arr[i],true);
        }

        for(int val:arr){
            if(hm.containsKey(val-1)){
                hm.put(val,false);
            }
        }

        int msp=0;
        int ml=0;

        for(int val:arr){
            if(hm.get(val)){
                int lsp=val;
                int  tl=1;

                while(hm.containsKey(lsp+tl)){
                    tl++;
                }

                if(tl>ml){
                    ml=tl;
                    msp=lsp;
                }

            }
        }

        for(int i=0;i<ml;i++){
            System.out.println(msp+i);
        }
    }
}
