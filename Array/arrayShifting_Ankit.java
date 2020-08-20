package ArrayAndFunction;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class arrayShifting_Ankit {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int rotation = scanner.nextInt();

        //Reverse total rotation element
        int lastIndex = a.length-1;
        int rotationReverse = lastIndex - rotation;
        for(int i = 1, j = lastIndex; i <= rotation/2; i++, j -= 1) {
            int index = rotationReverse + i;
            int temp = a[index];
            a[index] = a[j];
            a[j] = temp;
        }

        for(int i = 0, j = rotationReverse; i <= (rotationReverse)/2; i++, j -= 1) {
            if(j == i)
                break;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for(int i =0, j = lastIndex ; i <= lastIndex/2; i++, j-=1) {
            if(j == i)
                break;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for(int i =0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }



}
