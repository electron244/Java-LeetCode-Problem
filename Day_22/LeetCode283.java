public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        LeetCode283 obj = new LeetCode283();
        int[] arr = { 0, 1, 0, 3, 12 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        obj.moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
