import java.util.Scanner;

public class FibonacciNumber {

    public static int findNumber(int n){
        if (n==0 || n==1){
            return n;
        }
        return findNumber(n-1)+findNumber(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;
        n=scanner.nextInt();
        System.out.println(findNumber(n));
    }
}
