import java.util.HashMap;
import java.util.Map;

public class LeetCode997 {
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }
        for (int[] pair : trust) {
            map.put(pair[0], map.get(pair[0]) - 1);
            map.put(pair[1], map.get(pair[1]) + 1);
        }

        for (int i = 1; i <= n; i++) {
            if (map.get(i) == n - 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode997 obj = new LeetCode997();
        int[][] trust = { { 1, 3 }, { 2, 3 } };
        int n = 2;
        int ans = obj.findJudge(n, trust);
        System.out.println(ans);

    }
}