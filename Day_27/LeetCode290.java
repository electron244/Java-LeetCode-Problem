import java.util.HashMap;
import java.util.HashSet;

public class LeetCode290 {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (usedWords.contains(word)) {
                    return false;
                }
                map.put(c, word);
                usedWords.add(word);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LeetCode290 obj = new LeetCode290();
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean ans = obj.wordPattern(pattern, s);
        System.out.println(ans);
    }
}
