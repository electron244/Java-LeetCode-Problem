import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                idx.add(i);
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        LeetCode2089 obj = new LeetCode2089();
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 2;
        List<Integer> ans = obj.targetIndices(nums, target);
        System.out.print(ans);
    }
}
