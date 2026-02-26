public class LeetCode2529 {
    public int maximumCount(int[] nums) {
        int neg = lowerBound(nums, 0);
        int pos = nums.length - upperBound(nums, 0);
        return Math.max(neg, pos);
    }

    public int lowerBound(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;

    }

    public int upperBound(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] <= target)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }

    public static void main(String[] args) {
        LeetCode2529 obj = new LeetCode2529();
        int[] nums = { -3, -2, -1, 0, 0, 1, 2 };
        int ans = obj.maximumCount(nums);
        System.out.println(ans);
    }
}