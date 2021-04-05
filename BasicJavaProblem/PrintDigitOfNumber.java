package BasicJavaProblem;

import java.util.Scanner;

public class PrintDigitOfNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int digit=(int)Math.log10(n)+1;
        int pow=(int)Math.pow(10,digit-1);
        while(pow!=0){
            int ans=n/pow;
            n=n%pow;
            pow/=10;
            System.out.println(ans);
        }
    }
}
