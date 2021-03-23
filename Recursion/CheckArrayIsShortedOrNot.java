import java.util.Scanner;

public class CheckArrayIsShortedOrNot {
    public static boolean arrShort(int[] arr,int n){
        if (n==1){
            return true;
        }
        boolean sort=arrShort(arr,n-1);
        return (arr[n-1]>arr[n-2] && sort);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;
        n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
         arr[i]=scanner.nextInt();
        }
        System.out.println(arrShort(arr,n));

    }
}
