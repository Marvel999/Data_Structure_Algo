import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr=new int[n][m];

        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                arr[r][c]=scn.nextInt();
            }
        }

        spiralDisplay(arr);

    }

    public static void spiralDisplay(int[][] arr){
        int rs=0;
        int cs=0;
        int re=arr.length-1;
        int ce=arr[1].length-1;
        int count=0;
        int te=(arr.length)*(arr[1].length);

        while(count<te){
            // For left wall
            for(int i=rs;i<=re && count<te;i++){
                System.out.println(arr[i][cs]);
                count++;
            }
            cs++;

            // For bottom wall
            for(int i=cs;i<=ce && count<te;i++){
                System.out.println(arr[re][i]);
                count++;
            }

            re--;

            //for right well

            for(int i=re;i>=rs && count<te;i--){
                System.out.println(arr[i][ce]);
                count++;
            }

            ce--;

            //for Top well

            for(int i=ce;i>=cs && count<te;i--){
                System.out.println(arr[rs][i]);
                count++;
            }
            rs++;

        }

    }

}
