package String;

public class Sting_bulder {
    public static void main(String[] args) {
        StringBuilder stb=new StringBuilder("Hello Manish");
        System.out.println(stb.length());
        System.out.println(stb.append("A"));
        stb.indexOf("P",2);
        System.out.println();
        System.out.println(stb);
        stb.setCharAt(2,'v');
        System.out.println(stb);
        System.out.println(stb.charAt(2));
        stb.reverse();


    }
}
