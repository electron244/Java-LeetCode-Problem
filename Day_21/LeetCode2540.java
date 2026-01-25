import java.util.HashSet;
import java.util.Set;
public class LeetCode2540 {

    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                return nums2[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode2540 obj = new LeetCode2540();
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};
        int ans = obj.getCommon(nums1, nums2);
        System.out.print(ans);
    }
}
