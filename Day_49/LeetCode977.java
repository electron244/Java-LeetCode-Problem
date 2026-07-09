public class LeetCode977{
    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int idx = nums.length-1;
        while(i<=j){
            int num = Math.max(Math.abs(nums[i]),Math.abs(nums[j]));
            arr[idx--] = (int) Math.pow(num,2);
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                i++;
            }else{
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        LeetCode977 obj  = new LeetCode977();
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}