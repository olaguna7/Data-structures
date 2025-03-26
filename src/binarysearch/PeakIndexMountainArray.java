package binarysearch;

/**
 * Let's call an array arr a mountain if the following properties hold:
 * (1) arr.length >= 3
 * (2) arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * (3) arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 * Given an integer array arr that is guaranteed to be a mountain, return any i such that
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 */

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // We're in decreasing part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part of the array
                start = mid + 1;    // because we know that mid + 1 element > mid element
            }
        }

        // in the end, start == end and pointing to the largest number because of the two checks
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // More elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we're saying that only one item is remaining, hence, because of above line, that is the best
        // possible answer.
        return start;   // or return end, as both are equal
    }


}
