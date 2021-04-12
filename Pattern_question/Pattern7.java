import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n=scn.nextInt();
        int lspc=0;
        int rspc=n-1;

        for(int r=1;r<=n;r++){
            //print left space

            for(int i=1;i<=lspc;i++)
                System.out.print("	");
            //print star
            System.out.print("*	");
            // print right space
            for(int i=1;i<=rspc;i++)
                System.out.print("	");

            System.out.println();

            rspc--;
            lspc++;

        }

    }
    public static void equation(int n) {
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(r==c)
                    System.out.print("*	");
                else
                    System.out.print("	");

            }

            System.out.println();
        }
    }
}
