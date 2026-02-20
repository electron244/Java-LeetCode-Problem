public class LeetCode1512{
    public int numIdenticalPairs(int[] nums) {
        int goodPair = 0;
        for(int i  = 0;i<nums.length;i++){
            int right = nums.length-1;
            while(i < right){
                if(nums[i] == nums[right]){
                    goodPair++;
                }
                right--;
            }
        }
        return goodPair;
    }
    public static void main(String[] args) {
       LeetCode1512 obj = new LeetCode1512();
       int[] nums = {1,2,3,1,1,3};
       int ans = obj.numIdenticalPairs(nums); 
       System.out.println(ans);
    }
}