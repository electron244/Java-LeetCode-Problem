
import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums1) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        
        ArrayList<Integer> array = new ArrayList<>();
        for (int x : nums2) {
            if (map.containsKey(x) && map.get(x) > 0) {
                array.add(x);
                map.put(x, map.get(x) - 1);
            }
        }
        int arr[] = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            arr[i] = array.get(i);

        }

        return arr;
    }

    public static void main(String[] args) {
        LeetCode350 obj = new LeetCode350();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = obj.intersect(nums1, nums2);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
