import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int lspc=n/2;
        int mspc=-1;
        for(int r=1;r<=n;r++){
            //print space
            for(int i=1;i<=lspc;i++){
                System.out.print("\t");
            }
            //print star
            System.out.print("*\t");

            //print medial space
            for(int i=1;i<=mspc;i++){
                System.out.print("\t");
            }
            //print right star
            if(r!=1 && r!=n)
                System.out.print("*\t");
            System.out.println();

            if(r<=n/2){
                lspc--;
                mspc+=2;
            }else{
                lspc++;
                mspc-=2;
            }

        }
    }

    public static void equation(int n) {
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(c+r==(n+3)/2 || c-r==(n-1)/2 || c+r==(3*n+1)/2 || r-c==(n-1)/2)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }

    }
}
