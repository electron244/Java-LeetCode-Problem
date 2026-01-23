import java.util.Arrays;

public class LeetCode34 {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };

        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);

        result[0] = left;
        result[1] = right;

        return result;
    }

    private static int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int left = 0;
        int right = nums.length - 1;
        int idx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                idx = mid;

                // move left or right to find boundary
                if (isSearchingLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] ans = searchRange(nums, target);

        System.out.println("First and Last Position: " + Arrays.toString(ans));
    }
}
