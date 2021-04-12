import java.util.Scanner;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // write ur code here
        int n=scn.nextInt();
        int lspc=0;
        int mspc=n-2;
        for (int r=1;r<=n;r++){
            for (int i=1;i<=lspc;i++){
                System.out.print("	");
            }
            if(r!=(n+1)/2)
                System.out.print("*	");

            for (int i=1;i<=mspc;i++){
                System.out.print("	");
            }
            System.out.print("*	");

            System.out.println();

            if(r<=n/2){
                lspc++;
                mspc-=2;
            }else{
                lspc--;
                mspc+=2;
            }
        }

    }


    public static void equation(int n) {
        for (int r=1;r<=n;r++){
            for (int c=1;c<=n;c++){
                if(c==r){
                    System.out.print("*\t");
                }else if(c+r==n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
