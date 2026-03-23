import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeetCode2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for(int i : nums1) set1.add(i);
        for(int i : nums2) set2.add(i);
        for(int i : nums3) set3.add(i);
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : set1){
            map.put(n,map.getOrDefault(n, 0)+1);
        }   
        for(int n : set2){
            map.put(n,map.getOrDefault(n, 0)+1);
        }   
        for(int n : set3){
            map.put(n,map.getOrDefault(n, 0)+1);
        }   
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() >=2){
                res.add(entry.getKey());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode2032 obj = new LeetCode2032();
        int[] nums1 = { 1, 1, 3, 2 };
        int[] nums2 = { 3, 2 };
        int[] nums3 = { 3 };
        List<Integer> ans = obj.twoOutOfThree(nums1, nums2, nums3);
        System.out.println(ans.toString());
    }
}