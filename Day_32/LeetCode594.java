
import java.util.HashMap;
import java.util.Map;

public class LeetCode594{
    public int findLHS(int[] nums) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if(map.containsKey(key+1)){
                result = Math.max(result,map.get(key) + map.get(key+1));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        LeetCode594 obj = new LeetCode594();
        int[] nums = {1,3,2,2,5,2,3,7};
        int ans = obj.findLHS(nums);
        System.out.println(ans);
    }
}