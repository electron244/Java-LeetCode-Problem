public class LeetCode154 {
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        if (nums[lo] < nums[hi])
            return nums[lo];
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else if (nums[mid] < nums[hi]) {
                hi = mid;
            } else {
                hi--;
            }
        }
        return nums[hi];
    }

    public static void main(String[] args) {
        LeetCode154 obj = new LeetCode154();
        int[] nums = { 2, 2, 2, 0, 1 };
        int ans = obj.findMin(nums);
        System.out.println(ans);
    }
}
