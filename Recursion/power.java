package Recurssion_in_java;

public class power {
    public static void main(String[] args){
        System.out.println(pow(5,5));
        System.out.println(Fastpow(5,5));

    }

    public static int pow(int a, int b){
        if(b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }

    public static int Fastpow(int a, int b){
        if(b==0){
            return 1;
        }
        if(b%2!=0)
            return a*pow(a,b-1);

        return a*a*pow(a,b/2);
    }
}
