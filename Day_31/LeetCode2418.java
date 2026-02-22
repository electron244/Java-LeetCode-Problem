import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode2418 {
    public String[] sortPeople(String[] names, int[] heights) {
       Map<Integer,String> map = new HashMap<>();
        int n = names.length;
        for(int i = 0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[n];
        int idx = 0;
        for(int i = n-1 ;i>=0;i--){
            result[idx++] = map.get(heights[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        LeetCode2418 obj = new LeetCode2418();
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] ans  = obj.sortPeople(names, heights);
        for(String ch : ans){
            System.out.println(ch);
        }
    }
}
