package ArrayAndFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class All_subSet_Of_Array {
    public static void main(String[] args) throws IOException {

        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(in.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int num=(int)Math.pow(2,n);

        for(int i=0;i<num;i++){
            String set ="";
            int temp=i;
            for(int j=n-1;j>=0;j--){
                int r=temp%2;
                temp=temp/2;
                if(r==0){
                    set="_"+"\t"+set;
                }else{
                    set=arr[j]+"\t"+set;
                }
            }

            System.out.println(set);
        }
    }
}
