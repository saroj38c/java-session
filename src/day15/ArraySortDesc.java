package day15;

import java.util.Arrays;

public class ArraySortDesc {
    public static void main(String[] args) {
        int[] numbers = { 2, 13, 5, 17, 14, 1 };

            //Doesnot works with primitive data type
        // Integer numbers[] = { 2, 13, 5, 17, 14, 1 };
//        Arrays.sort(numbers, Collections.reverseOrder());
//        System.out.println(Arrays.toString(nums));

        //Descending order
        Arrays.sort(numbers);
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

    }
}
