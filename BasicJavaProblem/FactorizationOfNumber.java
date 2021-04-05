package BasicJavaProblem;

import java.util.Scanner;

public class FactorizationOfNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int temp=num;
        for(int i=2;i*i<=temp;){
            if(num==0)
                break;
            if(num%i==0){

                System.out.print(i+" ");
                num/=i;
            }
            else
                i++;
        }

    }
}
