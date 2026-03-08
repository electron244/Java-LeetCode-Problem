public class LeetCode485{
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int currentCount = 0;
        for(int num : nums){
            if(num ==1){
                currentCount++;
                maxOne = Math.max(maxOne,currentCount);
            }else{
                currentCount = 0;
            }
        }
        return maxOne;
    }
    public static void main(String[] args) {
        LeetCode485 obj = new LeetCode485();
        int[] nums = {1,0,1,1,0,1};
        int ans = obj.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}