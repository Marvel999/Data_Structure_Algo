package LeetCode.Arrays;

import java.util.*;

public class PartitionArrayThreeSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] a = new int[length];

        for (int i = 0; i < length; i++)
            a[i] = scanner.nextInt();

        System.out.println(canPartitionInArray(a));

    }

    static boolean canPartitionInArray(int []a) {

        for (int start = 0; start < a.length; start++) {

            int i = start;
            int j = start;
            int k = start;

            int firstSum = 0;
            int secondSum = 0;
            int thirdSum = 0;

            for (int firstIndex = 0; firstIndex <= i; firstIndex++) {
                firstSum += a[firstIndex];
            }

            for ( j = i+1; j < a.length; j++) {

                secondSum += a[j];
                if(secondSum == firstSum) {
                    k = j+1;
                    System.out.println("second sum " + secondSum);
                    break;
                }

            }

            for (; k < a.length; k++) {
                thirdSum += a[k];
                if (thirdSum == secondSum && thirdSum == firstSum) {
                    return true;
                }
            }

        }


        return false;
    }

    public List<Integer> addToArrayForm(int[] a, int k) {

        List<Integer> out = new ArrayList<>();

        int carry = 0;
        for (int i = a.length - 1; i >= 0; i--) {
           int ans = a[i] + k % 10 + carry;

           if(ans > 9) {
               ans = ans % 10;
               carry = 1;
           }else carry = 0;

           out.add(ans);
        }

        while (k != 0) {
            out.add(k %  10);
            k /= 10;
        }

        if(carry == 1) out.add(carry);

        Collections.reverse(out);

        return out;
    }
}
