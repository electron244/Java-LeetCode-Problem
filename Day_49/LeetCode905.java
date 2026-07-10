public class LeetCode905 {
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        if(nums.length ==1) return nums;
        while(left<right){
            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 == 1) {
                right--;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        //LeetCode905 obj = new LeetCode905();
        int[] nums = {3,1,2,4};
        int[] ans = sortArrayByParity(nums);
        for(int i : ans){
            System.out.print(i+ " ");
        }
    }
}
