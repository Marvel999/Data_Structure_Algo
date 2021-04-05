package BasicJavaProblem;

import java.util.Scanner;

public class
pythogorashTriplet {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int max=(int)Math.max(a,Math.max(b,c));
        if((a==max) && ((a*a)==(b*b+c*c))){
            System.out.println("true");
        }
        else if((b==max) && ((b*b)==(a*a+c*c))){
            System.out.println("true");
        }
        else if((c==max) && ((c*c)==(b*b+a*a))){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
