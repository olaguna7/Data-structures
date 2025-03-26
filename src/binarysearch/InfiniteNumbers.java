package binarysearch;

/**
 * Find position of an element in a sorted array of infinite numbers.
 *
 * Suppose you have a sorted array of infinite numbers, how would ou search an element in the array?
 */

public class InfiniteNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(searchInfiniteArray(arr, target));
    }

    // we'll consider the array is "infinite" in the sense that we can't use the length of the array
    public static int searchInfiniteArray(int[] nums, int target) {
        // first, find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > nums[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(nums, start, end, target);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
