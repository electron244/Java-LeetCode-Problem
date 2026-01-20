import java.util.Arrays;

public class LeetCode88 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,3,4};
        for(int j =0 ,i = nums1.length;j<nums2.length;j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
