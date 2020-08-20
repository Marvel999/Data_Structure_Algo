package ArrayAndFunction;

import java.util.Scanner;

public class cellAndFloorSolution {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
       int data= scanner.nextInt();
        int l=0;
        int h=n-1;
        int cell=0;
        int floor=0;
        while (l<=h){
            int mid=(l+h)/2;
            if(data>a[mid]){
                l=mid+1;
                floor=a[mid];
            }else if(data<a[mid]){
                h=mid-1;
                cell=a[mid];
            }
            else {
                cell=a[mid];
                floor=a[mid];
            }
        }

        System.out.println(cell);
        System.out.println(floor);

    }
}
