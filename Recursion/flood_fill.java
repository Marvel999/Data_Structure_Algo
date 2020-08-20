package Recurssion_in_java;

import java.util.Scanner;

public class flood_fill {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean[][] visit=new boolean[n][m];
        floodfill(arr,n,m,"",visit);
    }

    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited)
    {
        if(row>maze.length || col>maze.length || col<0 || row<0 || maze[row][col]==1 || !visited[row][col])
            return;


        if(row==maze.length-1 && col==maze.length-1 ){
            System.out.println(psf);
        }

        visited[row][col]=true;
        floodfill(maze,row-1,col,psf+"t",visited);
        floodfill(maze,row,col-1,psf+"l",visited);
        floodfill(maze,row+1,col,psf+"d",visited);
        floodfill(maze,row,col+1,psf+"r",visited);
    }
}
