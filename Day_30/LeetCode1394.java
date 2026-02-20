import java.util.HashMap;
import java.util.Map;

public class LeetCode1394 {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int luckNum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if ((key == map.get(key)) && (key > luckNum)) {
                luckNum = key;
            }
        }
        return luckNum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3 };
        LeetCode1394 obj = new LeetCode1394();
        int ans = obj.findLucky(arr);
        System.out.println(ans);

    }
}