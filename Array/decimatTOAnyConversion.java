package ArrayAndFunction;

import java.util.Scanner;

public class decimatTOAnyConversion {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n,int b){
        int i =0;
        int num=0;
        int tens=1;
        while(n!=0){
            int rem=n%b;
            num=num+rem*tens;
            n=n/b;
            tens *=10;
              
        }
        //   StringBuilder s=new StringBuilder(Integer.toString(num));

        //     s.reverse();

        //     int bo= Integer.parseInt(String.valueOf(s));

        return num;

    }
}
