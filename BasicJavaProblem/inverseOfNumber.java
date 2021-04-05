package BasicJavaProblem;

import java.util.Scanner;

public class inverseOfNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        int result=0;
        int count=0;
        while(num!=0){
            int rem=num%10;
            num/=10;
            count++;
            int pow=(int)Math.pow(10,rem-1);
            result+=count*pow;
        }
        System.out.println(result);
    }
}
