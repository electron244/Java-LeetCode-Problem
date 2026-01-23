public class LeetCode268{
    public int missingNumber(int[] nums){
        int n = nums.length;
        int arrSum = n*(n+1)/2;
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        return arrSum - sum;

    }

    public static void main(String[] args) {
        LeetCode268 obj = new LeetCode268();
        int[] nums = {3,0,1};
        int ans = obj.missingNumber(nums);
        System.err.println(ans);
    }
}