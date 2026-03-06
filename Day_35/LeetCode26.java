public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int slow = 0;
        for(int fast = 1;fast<nums.length;fast++){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }

        }
        return slow+1;
    }
    public static void main(String[] args) {
        LeetCode26 obj = new LeetCode26();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = obj.removeDuplicates(nums);
        System.out.println(ans);
    }
}
