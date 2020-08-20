package ArrayAndFunction;

import java.util.Scanner;

public class sub_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking input
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+"\t");
                    if(k==j)
                        System.out.println();
                }

            }
        }


    }
}
