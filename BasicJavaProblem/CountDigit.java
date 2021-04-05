package BasicJavaProblem;

import com.sun.xml.internal.bind.v2.util.EditDistance;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int digit=0;
        while(n!=0){
            n/=10;
            digit++;
        }
        System.out.println(digit);
    }

    public static int digitCounter(int n){
      return (int)(Math.log10(n)+1.0);
    }
}
