public class LeetCode645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int num:nums){
            freq[num]++;
        }
        int duplicate = -1,missing = -1;
        for(int i = 1;i<=n;i++){
            if(freq[i] == 2) duplicate = i;
            if(freq[i] == 0) missing = i;
        }
        return new int[]{duplicate,missing};
    }

    public static void main(String[] args) {
        LeetCode645 obj = new LeetCode645();
        int[] nums = {1,2,2,4};
        int[] ans = obj.findErrorNums(nums);
        for (int num : ans) {
            System.out.println(num);
        }
    }
}
