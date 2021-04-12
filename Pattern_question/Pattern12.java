import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // write ur code here
        int a=0;
        int b=1;
        int n=scn.nextInt();
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print(a+"\t");
                int f=a+b;
                a=b;
                b=f;
            }
            System.out.println();
        }
    }
}
