import java.util.HashSet;

public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode217 obj = new LeetCode217();
        int[] nums = { 1, 2, 3, 1 };
        boolean ans = obj.containsDuplicate(nums);
        System.out.println(ans);
    }
}