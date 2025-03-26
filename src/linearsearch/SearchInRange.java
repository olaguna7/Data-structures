package linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(searchRange(arr, target, 1, 4));
    }

    public static int searchRange(int[] arr, int target, int startIndex, int endIndex) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
