
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }

    public static void main(String[] args) {
        LeetCode349 obj = new LeetCode349();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans = obj.intersection(nums1, nums2);
        for (int i : ans) {
            System.out.print(i);
        }
    }

}
