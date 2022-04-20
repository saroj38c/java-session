package day15;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = { 2, 13, 5, 17, 14, 1 };
        int[] nums = { 2, 13, 5, 17, 14, 1 };
        //Asc Order
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //Descending order
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

    }
}
