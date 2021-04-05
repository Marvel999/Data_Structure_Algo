package BasicJavaProblem;

import java.util.Scanner;

public class PrintDigitRightToLeft {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        while(num!=0){
            int rem=num%10;
            num/= 10;
            System.out.println(rem);
        }
    }
}
