
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2824 {

    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode2824 obj = new LeetCode2824();
        List<Integer> nums = new ArrayList<>(Arrays.asList(-1, 1, 2, 3, 1));
        int target = 2;
        int ans = obj.countPairs(nums, target);
        System.out.print(ans);
    }
}
