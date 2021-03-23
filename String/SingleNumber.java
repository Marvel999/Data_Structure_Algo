package String;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] nums) {
     Arrays.sort(nums);
     int i=0;
     int j=1;
     while (j<nums.length){
         if (nums[i]!=nums[j]){
             return nums[i];
         }else {
             i=j+1;
             j=i+1;
         }
     }
     if (j<nums.length)
     return -1;
     else
         return nums[i];
    }

}
