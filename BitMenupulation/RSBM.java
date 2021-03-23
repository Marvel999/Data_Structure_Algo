package BitMenupulation;

import java.util.Scanner;

public class RSBM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rmbm=(n&-n);
        System.out.println(Integer.toBinaryString(rmbm));
    }
}
