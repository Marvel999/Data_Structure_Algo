package String;

public class Basic_string {
    public static void main(String[] args) {
        String s;
        s="hello raju";
        System.out.println(s.length());
        System.out.println(s.charAt(6));// s[]->s.charAt()
        System.out.println(s.substring(1,3));// 3 index not print;
        System.out.println(s.substring(1,1));// 1 index not print; empty
//        System.out.println(s.substring(2,1));// end start respactive  argument
        System.out.println(s.substring(1));// s[]->s.charAt()

    }
}
