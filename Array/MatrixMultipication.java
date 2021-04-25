import java.util.Scanner;

public class MatrixMultipication {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int r1=scn.nextInt();
        int c1=scn.nextInt();
        int[][] mat1=new int[r1][c1];
        for(int r=0;r<r1;r++){
            for(int c=0;c<c1;c++){
                mat1[r][c]=scn.nextInt();
            }
        }

        int r2=scn.nextInt();
        int c2=scn.nextInt();
        int[][] mat2=new int[r2][c2];
        for(int r=0;r<r2;r++){
            for(int c=0;c<c2;c++){
                mat2[r][c]=scn.nextInt();
            }
        }

        if(c1==r2){

            int[][] result=new int[r1][c2];

            for(int r=0;r<r1;r++){
                for(int c=0;c<c2;c++){
                    int sum=0;
                    for(int k=0;k<c1;k++){
                        sum+=mat1[r][k]*mat2[k][c];
                    }
                    result[r][c]=sum;
                }
            }

            for(int r=0;r<result.length;r++){
                for(int c=0;c<result[1].length;c++){
                    System.out.print(result[r][c]+" ");
                }
                System.out.println();
            }

        }
        else{
            System.out.println("Not Matrix Mul");
        }

    }

}
