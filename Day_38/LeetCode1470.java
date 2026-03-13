public class LeetCode1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = n;
        int k = 0;
        while(i<n){
            res[k] = nums[i];
            k++;
            i++;
            res[k] = nums[j];
            k++;
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode1470 obj = new LeetCode1470();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = obj.shuffle(nums, n);
        for(int num : ans) System.out.print(num + " ");
    }
}
