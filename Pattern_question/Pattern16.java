import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n=scn.nextInt();
        int spc=2*n-3;
        int stc=1;

        for(int r=1;r<=n;r++){
            int value=1;

            //print left number
            for(int i=1;i<=stc;i++){
                System.out.print(value+"\t");
                value++;
            }
            //print space
            for(int i=1;i<=spc;i++){
                System.out.print("\t");
            }

            value=r==n?value-1:value;
            stc=r==n?stc-1:stc;
            //print right number
            for(int i=1;i<=stc;i++){
                value--;
                System.out.print(value+"\t");
            }

            System.out.println();
            stc++;
            spc-=2;
        }

    }
}
