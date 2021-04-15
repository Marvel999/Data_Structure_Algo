import java.util.Scanner;

public class Pattern18 {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            // write ur code

            //  by equation mathod
            int n=scn.nextInt();
            for(int r=1;r<=n;r++)
            {
                for(int c=1;c<=n;c++){

                    if(r==1 || c+r==n+1 || c==r ){
                        System.out.print("*\t");
                    }
                    else if(c<r && c+r>n+1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }

                }

                System.out.println();
            }


        }

}
