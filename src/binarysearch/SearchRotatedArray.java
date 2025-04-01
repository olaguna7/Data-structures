package binarysearch;

/*
 * Search in rotated sorted array.
 *
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
 * such that the resulting array is [nums[k], nums[k + 1], ..., nums[n - 1], nums[0], nums[1], ..., nums[k - 1]]
 * (0-indexed). For example, [0, 1, 2, 3, 4, 5, 6, 7] might be rotated at pivot index 3 and become [3, 4, 5, 6, 7, 0, 1, 2].
 *
 * Given the array "nums" after the rotation and an integer target, return the index of target if it is in nums,
 * or -1 if it is not in nums.
 *
 */

public class SearchRotatedArray {
    public static void main(String[] args) {

    }


    public static int searchInRotatedArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (arr[start] <= arr[mid]) {
                // Target is in the left sorted array
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Right half is sorted
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
