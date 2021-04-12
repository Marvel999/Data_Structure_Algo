import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int valc=1;
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print(valc+"\t");
                valc++;
            }
            System.out.println();
        }

    }
}
