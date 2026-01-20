public class LeetCode35 {

    public int searchInsert(int[] nums, int target) {
        int left= 0;
        int right = nums.length-1;
        while(left<=right){
          int mid =  left+(right-left)/2;  
          if(nums[mid] == target) return mid;
          else if(nums[mid] > target) right = mid-1;
          else left = mid+1;
        }
        return left;
    }
    public static void main(String[] args) {
        LeetCode35 obj = new LeetCode35();
        int[] arr = {1,3,5,6};
        int target = 5;
        int ans = obj.searchInsert(arr, target);
        System.out.print(ans);
    }
}
