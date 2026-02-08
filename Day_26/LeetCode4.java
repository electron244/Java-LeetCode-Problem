import java.util.Arrays;

public class LeetCode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merge = new int[m + n];
        for (int i = 0; i < m; i++) {
            merge[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merge[m + i] = nums2[i];
        }
        Arrays.sort(merge);
        if (merge.length % 2 == 1) {
            return merge[merge.length / 2];
        } else {
            return (merge[merge.length / 2 - 1] + merge[merge.length / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        LeetCode4 obj = new LeetCode4();
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        double ans = obj.findMedianSortedArrays(nums1, nums2);
        System.out.println(ans);
    }
}