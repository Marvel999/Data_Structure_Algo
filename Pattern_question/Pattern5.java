import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

            // write ur code here

            int n=scn.nextInt();
            int spc=n/2;
            int stc=1;
            for(int r=1;r<=n;r++){

                //Print space

                for(int i=1;i<=spc;i++){
                    System.out.print("\t");
                }

                //Print star

                for(int i=1;i<=stc;i++){
                    System.out.print("*\t");
                }
                //Print new line

                System.out.println();

                if(r<=n/2){
                    spc--;
                    stc+=2;
                }else{
                    spc++;
                    stc-=2;
                }

            }

        }


    public static void equationMahod(int n) {
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                //   space
                if(c+r<(n+3)/2 || c-r>(n-1)/2 || c+r>(3*n+1)/2 || r-c>(n-1)/2){
                    System.out.print("\t");
                }
                //   Star
                else{
                    System.out.print("*\t");
                }

            }
            System.out.println();
        }

    }
}
