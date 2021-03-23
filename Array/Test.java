import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n=0;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int sum=0;
        while (n>0 || sum>9){
            if(n==0){
                n=sum;
                sum=0;
            }
         int rem=n%10;
         n=n/10;
         sum=sum+rem;

        }

        System.out.println(sum);
    }
}
