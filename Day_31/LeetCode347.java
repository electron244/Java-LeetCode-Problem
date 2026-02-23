import java.util.*;

public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];
        for(int num : nums){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a,b)-> b.getValue() - a.getValue());

        for(int i = 0 ;i<k ;i++){
            res[i] = entries.get(i).getKey();
        }

        return res;
    }
    public static void main(String[] args) {
        LeetCode347 obj = new LeetCode347();
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        int[] ans= obj.topKFrequent(nums, k);
        for(int i : ans){
            System.out.println(i);
        }
    }
}
