import java.util.Scanner;

public class AdditionOfArray {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] a=new int[n1];
        for(int i=0;i<n1;i++)
            a[i]=scn.nextInt();

        int n2=scn.nextInt();
        int [] b=new int[n2];
        for(int i=0;i<n2;i++)
            b[i]=scn.nextInt();

        int[] res=addArray(a,b,n1,n2);

        for(int i=0;i<res.length;i++){
            if(res[0]!=0)
                System.out.println(res[i]);
            if(i>0)
                System.out.println(res[i]);

        }

    }

    public static int[] addArray(int[] a,int[] b,int n1, int n2){
        int max=Math.max(n1,n2)+1;
        int[] add=new int[max];
        int i=max-1;
        int j=n1-1;
        int k=n2-1;
        int sum=0;
        int carry=0;
        while(i>=0){
            sum=+carry;
            if(j>=0)
                sum+=a[j];
            if(k>=0)
                sum+=b[k];

            int d=sum%10;
            carry=sum/10;
            add[i]=d;
            j--;
            k--;
            i--;
        }

        return add;
    }

}
