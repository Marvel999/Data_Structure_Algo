package BasicJavaProblem;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class printAllPrimeTillN {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int low=scan.nextInt();
        int high=scan.nextInt();
        for (int i=low;i<=high;i++){
            if (isPrime(i))
                System.out.println(i);
        }

    }
    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
}
