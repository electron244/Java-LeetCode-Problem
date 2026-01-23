public class LeetCode704 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LeetCode704 obj  = new LeetCode704();
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        int ans = obj.search(arr, target);
        System.out.println(ans);
    }
}
