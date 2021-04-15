import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

    // write ur code here


    }

    public static void patternEqutation(int n) {
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){

                if(r==(n+1)/2){
                    System.out.print("*\t");
                }
                else if(c==(n+1)/2){
                    System.out.print("*\t");
                }
                else if(c>n/2 && c-r<=(n-1)/2 ){
                    System.out.print("*\t");
                }
                else if(c>n/2 &&  c+r<=((3*n)+1)/2 ){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();
    }
    }

    public static void saprableMathode(int n){
        int lspc=n/2;
        int stc=1;
        for(int r=1;r<=n;r++){
            // Print Space

            for(int i=1;i<=lspc;i++){
                if(r==(n+1)/2)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }

            //Print star

            for(int i=1;i<=stc;i++){
                System.out.print("*\t");
            }

            //Print new line
            System.out.println();

            if(r<=n/2){
                stc++;
            }else{
                stc--;
            }
        }
    }
}
