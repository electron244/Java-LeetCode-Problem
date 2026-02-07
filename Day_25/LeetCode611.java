import java.util.Arrays;

public class LeetCode611 {
    public int triangleNumber(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i = n-1;i>=2;i--){
            int left = 0,right = i-1;
            while(left<right){
                if(nums[left] + nums[right] > nums[i]){
                    count += right-left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        LeetCode611 obj = new LeetCode611();
        int[] nums = {2,2,3,4};
        int ans = obj.triangleNumber(nums);
        System.out.println(ans);
    }
}
