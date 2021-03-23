import java.util.Scanner;

public class FirstAndLastOccurenceOfNumberInAnArray {

    public static int firstOccurence(int[] arr, int n,int i,int key){
        if (i==n){
            return -1;
        }

        if (arr[i]==key){
            return i+1;
        }

        return firstOccurence(arr,n,i+1,key);


    }

    public static int lastOccurence(int[] arr, int n,int i,int key){

        if (i==n){
            return -1;
        }

       int b= lastOccurence(arr,n,i+1,key);

        if (b!=-1)
            return b;

        if (arr[i]==key){
            return i+1;
        }

        return -1;


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int key=scanner.nextInt();
        System.out.println(firstOccurence(arr, n,0,key));
        System.out.println(lastOccurence(arr, n,0,key));
    }
}
