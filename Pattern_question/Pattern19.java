import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){

                if(c==(n+1)/2 || r==(n+1)/2){
                    System.out.print("*\t");
                }
                else if(r==1 && c<=n/2){
                    System.out.print("*\t");
                }else if(r==n && c>(n+1)/2){
                    System.out.print("*\t");
                }else if(c==1 && r>(n+1)/2){
                    System.out.print("*\t");
                }else if(c==n && r<= n/2){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
