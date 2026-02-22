import java.util.HashSet;
import java.util.Set;

public class LeetCode771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count= 0;
        Set<Character> set = new HashSet<>();
        for(char ch : jewels.toCharArray()){
            set.add(ch);
        }
        for(char ch:stones.toCharArray()){
            if(set.contains(ch))count++;
        }
        return count;
    }
    public static void main(String[] args) {
        LeetCode771 obj = new LeetCode771();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int ans = obj.numJewelsInStones(jewels, stones);
        System.out.println(ans);
    }
}
