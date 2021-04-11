import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n=scn.nextInt();
        int lspc=0;
        int rspc=n-1;

        for(int r=1;r<=n;r++){
            //print left space

            for(int i=1;i<=lspc;i++)
                System.out.print("\t");
            //print star
            System.out.print("*\t");
            // print right space
            for(int i=1;i<=rspc;i++)
                System.out.print("\t");

            System.out.println();

            rspc--;
            lspc++;

        }

    }

    public static void equationMathod(int n) {
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
               if(r==c){
                   System.out.println("*\t");
               }else{
                   System.out.println("\t");
               }
            }
        }
    }
}
