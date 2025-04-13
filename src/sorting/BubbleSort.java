package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Test 1
        int[] arr = {1, 3, 3, 6, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Test 2
        int[] arr2 = {-3, 7, -231, 9, 0};
        System.out.println("\nOriginal array: " + Arrays.toString(arr2));
        bubbleSort(arr2);
        System.out.println("Sorted array: " + Arrays.toString(arr2));

        // Test 3: Only one item array
        int[] arr3 = {3};
        System.out.println("\nOriginal array: " + Arrays.toString(arr3));
        bubbleSort(arr3);
        System.out.println("Sorted array: " + Arrays.toString(arr3));

        // Test 4: Empty array
        int[] arr4 = {};
        System.out.println("\nOriginal array: " + Arrays.toString(arr4));
        bubbleSort(arr4);
        System.out.println("Sorted array: " + Arrays.toString(arr4));

    }

    public static void bubbleSort(int[] array) {
        // Run the steps N - 1 times
        for (int i = 0; i < array.length; i++) {
            int swapedValues = 0;   // Counts the times j index swap values
            // For each step, max item will come at the last respective index
            for (int j = 1; j < array.length - i; j++) {
                // Swap if the item is smaller than the previos item
                if (array[j] < array[j - 1]) {
                    // Swap
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapedValues++;
                }
            }

            // If the j index did not swap, break the loop
            if (swapedValues == 0) {
                i = array.length;
            }
        }
    }
}
