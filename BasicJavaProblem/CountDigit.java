package BasicJavaProblem;

import com.sun.xml.internal.bind.v2.util.EditDistance;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(digitCounter(n));
    }

    public static int digitCounter(int n){
      return (int)(Math.log10(n)+1.0);
    }
}
