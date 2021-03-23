import java.util.Scanner;

public class ReverseTheString {
    public static void revString(String s){
        if (s.length()==0){
            return;
        }
        String ros=s.substring(1);
        revString(ros);
        System.out.print(s.charAt(0));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        revString(s);
    }

}
