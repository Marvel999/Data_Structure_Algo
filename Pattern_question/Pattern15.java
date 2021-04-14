import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n=scn.nextInt();
        int lspc=n/2;
        int number=1;
        int setValue=1;

        for(int r=1;r<=n;r++){
            int value=setValue;
            //Left space
            for(int i=1;i<=lspc;i++){
                System.out.print("\t");
            }

            //Print number
            for(int i=1;i<=number;i++){
                System.out.print(value+"\t");
                if(i<=number/2){
                    value++;
                }else{
                    value--;
                }
            }

            //Go to next line
            System.out.println();

            if(r<=n/2){
                lspc--;
                number+=2;
                setValue++;
            }else{
                lspc++;
                number-=2;
                setValue--;
            }

        }

    }
}
