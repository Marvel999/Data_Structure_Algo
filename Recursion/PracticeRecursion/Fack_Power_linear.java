package PracticeRecursion;

public class Fack_Power_linear {
    public static void main(String[] args) {
        fackPowerLinear(2,5);
    }

    public static int fackPowerLinear(int x,int n) {
        if(n==0)
            return 1;
        int xnp=fackPowerLinear(x,n/2)*fackPowerLinear(x,n/2);
        if (n%2==1){
            xnp=xnp*x;
        }
        return xnp;
    }
}
