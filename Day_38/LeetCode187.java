import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);
            if (!seen.add(sub))
                repeated.add(sub);
        }
        return new ArrayList<>(repeated);
    }

    public static void main(String[] args) {
        LeetCode187 obj = new LeetCode187();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> ans = obj.findRepeatedDnaSequences(s);
        System.out.println(ans);
    }
}
