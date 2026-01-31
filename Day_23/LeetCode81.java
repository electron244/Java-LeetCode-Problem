public class LeetCode81 {
    public boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode81 obj = new LeetCode81();
        int target = 0;
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        boolean ans = obj.search(nums, target);
        System.out.print(ans);

    }
}
