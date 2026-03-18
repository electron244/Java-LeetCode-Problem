import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");
        for (String word : words) {
            if (!word.isEmpty() && !set.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        String res = "";
        int count = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            //System.out.println(entry.getKey()+entry.getValue());
            if(entry.getValue() > count){
                count = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode819 obj = new LeetCode819();
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = { "hit" };
        String ans = obj.mostCommonWord(paragraph, banned);
        System.out.println(ans);

    }
}