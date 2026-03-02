import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                res.add(num);
            } else {
                set.add(num);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode442 obj = new LeetCode442();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = obj.findDuplicates(nums);
        System.out.println(ans);
    }
}
