package sorting;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in
 * the range that is missing from the array.
 *
 * Implement a solution using only O(1) extra space complexity and O(n) runtime complexity
 *
 * Example:
 * Input: nums = [3, 0, 1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0, 3].
 * 2 is the missing number in the range since it does not appear in nums.
 */
public class MissingNumber {
    public static void main(String[] args) {

    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while ((arr[i] != i) && (arr[i] != arr.length)) {
                int temp = arr[i];
                arr[i] = arr[arr[i]];
            }
        }
    }

    public static int findMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        return arr.length;
    }
}
