package binarysearch;

/*
 * Given an array of integers nums sorted in ascending order, find the starting and ending position
 * of a gievn target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;


    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // Search first occ
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;

    }

    public int search(int[] nums, int target, boolean searchFirstOcc) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (searchFirstOcc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

}
