import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(c==1 || c==n){
                    System.out.print("*\t");
                }
                else if(c+r==n+1 && c<=(n+1)/2){
                    System.out.print("*\t");
                }
                else if(c==r && c>(n+1)/2){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
