package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Test 1
        int[] array = {1, 5, 2, 2, 9, 8, 27};
        System.out.println("Original array: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                // Swap values if j-th element is less than (j-1)-th element
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

                // If the j-th element is greater than j-1 element, break the loop
                if (arr[j] > arr[j - 1]) {
                    j = -1;
                }
            }
        }
    }
}
