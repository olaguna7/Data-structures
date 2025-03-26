package binarysearch;

/**
 * Find in mountain array
 *
 * You may recall that an array A is a mountain array if and only if:
 * - A.length >= 3
 * - There exists some i with 0 < i < A.length - 1 such that:
 *      - A[0] < A[1] < ... < A[i - 1] < A[i]
 *      - A[i] > A[i + 1] > ... > A[A.length - 1]
 *
 * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target.
 * If such an index doesn't exist, return -1.
 */

public class FindMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        // Try to search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);

    }

    public static int orderAgnosticBS(int[]arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAscending = arr[start] < arr[end];


        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds range of int in Java

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
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
