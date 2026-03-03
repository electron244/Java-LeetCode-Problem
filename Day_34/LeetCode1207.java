import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode1207{
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(int value : map.values()){
            set.add(value);
        }
        return set.size() == map.values().size();
    }
    public static void main(String[] args) {
        LeetCode1207 obj = new LeetCode1207();
        int[] arr = {1,2,2,1,1,3};
        boolean ans = obj.uniqueOccurrences(arr);
        System.out.println(ans);
    }
}