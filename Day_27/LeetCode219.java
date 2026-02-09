import java.util.HashMap;

public class LeetCode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)) {
                // if (i - map.get(nums[i]) <= k) {
                //     return true;
                // }
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode219 obj = new LeetCode219();
        int[] nums = { 1,2,3,1,2,3 };
        int k = 2;
        boolean ans = obj.containsNearbyDuplicate(nums, k);
        System.out.println(ans);
    }
}
