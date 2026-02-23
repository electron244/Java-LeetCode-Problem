import java.util.*;

public class LeetCode229 {
     public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);

            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 3) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public static void main(String[] args) {
        LeetCode229 obj = new LeetCode229();
        int[] nums = {3,2,3};
        List<Integer> ans = obj.majorityElement(nums);
        System.out.println(ans);
    }
}
