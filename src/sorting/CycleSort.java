package sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        cycleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int[] arr2 = {6, 9, 8, 7 , 4, 2, 1, 3, 5};
        System.out.println("\nOriginal array: " + Arrays.toString(arr2));
        cycleSort(arr2);
        System.out.println("Sorted array: " + Arrays.toString(arr2));
    }

    /**
     * Cycle sort: O(n) time complexity
     */
    public static void cycleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            while (arr[i] != i + 1) {
                int value = arr[i];
                arr[i] = arr[value - 1];
                arr[value - 1] = value;
            }
        }
    }

    // Alternative code
    public static void cycleSort2(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
