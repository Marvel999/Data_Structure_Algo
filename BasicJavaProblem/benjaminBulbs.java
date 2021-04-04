package BasicJavaProblem;

import java.util.*;

public class benjaminBulbs {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }

    }
}
