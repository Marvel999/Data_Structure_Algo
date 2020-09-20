package TwoDimationalArray;

import java.util.Scanner;

public class Exit_point {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int i=0;
        int j=0;
        int dir=0;
        while(true){
            dir=(dir+arr[i][j])%4;

            if(dir==0){ //east;
                j++;
            }else if(dir==1){//south
                i++;
            }else if(dir==2){//north
                i--;
            }else if(dir==3){//west
                j--;
            }

            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }
            else if(j==arr[0].length){
                j--;
                break;
            }else if(i==arr.length){
                i--;
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);

    }
}
