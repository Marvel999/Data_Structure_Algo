import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n=scn.nextInt();

        int lspc=n-1;

        for(int r=1;r<=n;r++){
            //Print left space
            for(int i=1;i<=lspc;i++){
                System.out.print("	");
            }
            System.out.print("*	");

            lspc--;
            System.out.println();
        }

    }

    public static void equation(int n) {
        for(int r=1;r<=n;r++){
            for (int c=1;c<=n;c++){
                if(c+r==n+1){
                    System.out.print("*	");
                }
                else{
                    System.out.print("	");
                }
            }
            System.out.println();
        }
    }
}
