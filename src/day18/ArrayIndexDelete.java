package day18;

import java.util.Arrays;

public class ArrayIndexDelete {
    public static void main(String[] args) {
        int[] numbers = { 10,20,30,40,50,60};
        System.out.println("Before deleting index Array: " + Arrays.toString(numbers));
        int removeIndex = 3;
        System.out.println("Element to be removed at index: " + removeIndex);

        if (numbers == null || removeIndex < 0 || removeIndex>= numbers.length) {
            System.out.println("No deletion operation can be performed!!");
        }

        int[] tempArray = new int[numbers.length - 1];
        int count = 0;
        for (int i = 0; i <numbers.length; i++) {
            if (i == removeIndex) {
                continue;
            }
            tempArray[count++] = numbers[i];
        }

        System.out.println("Array after removal operation: " + Arrays.toString(tempArray));
    }
}
