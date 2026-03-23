import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }
        if (diff.size() == 0) {
            Set<Character> set = new HashSet<>();
            for (char ch : s.toCharArray())
                set.add(ch);
            return set.size() < s.length();
        }
        if (diff.size() == 2) {
            int i = diff.get(0);
            int j = diff.get(1);
            return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode859 obj = new LeetCode859();
        String s = "ab";
        String goal = "ba";
        boolean ans = obj.buddyStrings(s, goal);
        System.out.println(ans);
    }
}
