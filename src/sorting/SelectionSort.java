package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // Test 1
        int[] arr1 = {1, 5, 6, 2, 4};
        System.out.println("Original array: " + Arrays.toString(arr1));
        selectionSort(arr1);
        System.out.println("Sorted array: " + Arrays.toString(arr1));

        // Test 2
        int[] arr2= {2, 4, 1, 9, 0};
        System.out.println("\nOriginal array: " + Arrays.toString(arr2));
        selectionSort(arr2);
        System.out.println("Sorted array: " + Arrays.toString(arr2));

        // Test 3: One element sorting
        int[] arr3 = {1};
        System.out.println("\nOriginal array: " + Arrays.toString(arr3));
        selectionSort(arr3);
        System.out.println("Sorted array: " + Arrays.toString(arr3));

        // Test 4: No elements
        int[] arr4 = {};
        System.out.println("\nOriginal array: " + Arrays.toString(arr4));
        selectionSort(arr4);
        System.out.println("Sorted array: " + Arrays.toString(arr4));
    }

    // Returns the index of the maximum element of an array until the "end" index
    public static int findMax(int[] array, int end) {
        int max = 0;
        for (int i = 1; i <= end; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }

        return max;
    }

    // Selection sort algorithm: O(N^2)
    // We search consecutively for the maximum element at the array, and swap the values on
    // the corresponding index
    public static void selectionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int max = findMax(array, array.length - i);
            int temp = array[max];
            array[max] = array[array.length - i];
            array[array.length - i] = temp;
        }
    }
}
