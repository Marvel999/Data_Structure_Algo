package ArrayAndFunction;

import java.util.Scanner;

public class rotation_opt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int t=sc.nextInt();

        if(t<0){
            t=n+t;
        }else{
            if(t<n/2)
                t=t+1;
        }
//        int n1=sc.nextInt();
       int temp;
       int t1=(n-t+1)/2;
//        System.out.println(t1);
        for(int i=0;i<t1;i++){
            temp=arr[t+i-1];
            arr[t+i-1]=arr[n-i-1];
            arr[n-i-1]=temp;
//            System.out.println(temp);
        }

        t1=(t-1)/2;
//        System.out.println(t1);
        for(int i=0;i<t1;i++){
            temp=arr[i];
            arr[i]=arr[n-i-1-(n-t+1)];
            arr[n-i-1-(n-t+1)]=temp;
//            System.out.println(temp);
        }


        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
//            System.out.println(temp);
        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
