import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int spc=0;
        int stc=n;
        for (int r=1;r<=n;r++){
            //space
            for(int i=1;i<=spc;i++)
                System.out.print("\t");
            //star
            for(int i=1;i<=stc;i++)
                System.out.print("*\t");

            System.out.println();

            stc--;
            spc++;

        }

    }

    public static void eqution(int n){
        for(int r=1;r<=n;r++){

            for(int c=1;c<=n;c++){
                if(r>c){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }

            }
            System.out.println();

        }

    }
}
