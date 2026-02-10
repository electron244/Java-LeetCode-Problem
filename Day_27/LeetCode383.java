import java.util.HashMap;

public class LeetCode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : ransomNote.toCharArray()) {
            if(map.containsKey(ch) && map.get(ch) > 0){
                map.put(ch,map.get(ch)-1);
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode383 obj = new LeetCode383();
        String ransomNote = "a";
        String magazine = "b";
        boolean ans = obj.canConstruct(ransomNote, magazine);
        System.out.println(ans);
    }
}
