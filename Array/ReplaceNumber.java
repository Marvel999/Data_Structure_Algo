package LeetCode.Arrays;

import java.util.*;

public class ReplaceNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) arr[i] = scanner.nextInt();

        int b = findUnsortedSubArray(arr);

        System.out.println(b);
    }

    public static int findUnsortedSubArray(int []nums) {
        int unsortedArrayLength = 0;

        if (nums.length < 2) return unsortedArrayLength;

        int start = 0;
        int end = nums.length-1;


        for(int i = 0; i < nums.length-1; i++) {

            if (nums[start] <= nums[start+1] && nums[start] <= nums[end]) {
                start++;
            } else if (nums[end] >= nums[end-1] && nums[start] <= nums[end]) {
                end--;
            }

        }

       // System.out.println("start " + start + " end " + end);
        if(start != nums.length-1 && start <= end)
        unsortedArrayLength = end - start + 1;

        return unsortedArrayLength;
    }

    public static int findEfficientPairs(int[] nums, int k) {

        int res = 0;
        if (k < 0) return res;

        Map<Integer, Integer> map = new HashMap<>();

        for (int element : nums) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        for (int element : map.keySet()) {

            if (k == 0) {
                if (map.get(element) >= 2) res++;
            }else {
                if (map.containsKey(element + k)) res++;
            }

        }



        return res;
    }

    public static int findPairs(int[] nums, int k) {

        int count = 0;

        HashMap<Integer,Integer> hmap = new HashMap<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int diff = Math.abs(nums[i] - nums[j]);

                if (diff == k){
                    if (hmap.containsKey(nums[i]) && hmap.containsValue(nums[j])) {

                    }else {
                        hmap.put(nums[i], nums[j]);
                        count++;
                    }
                    //System.out.println("diff " + diff + " i = " + i + " j = " + j);

                }
            }
        }

        return count;

    }

    public static int[] replaceElements(int[] arr) {

        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;

        for (int start_index = arr.length-2; start_index >= 0; start_index--) {

            if (arr[start_index] >= max) {
                int temp = arr[start_index];
                arr[start_index] = max;
                max = temp;
            }else {
                arr[start_index] = max;
            }

        }
     return arr;
    }
}
