import java.util.*;

public class LeetCode336{
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            
            for (int cut = 0; cut <= word.length(); cut++) {
                String left  = word.substring(0, cut);
                String right = word.substring(cut);

                
                if (isPalindrome(left)) {
                    String need = new StringBuilder(right).reverse().toString();
                    if (map.containsKey(need) && map.get(need) != i) {
                        res.add(Arrays.asList(map.get(need), i)); 
                    }
                }

                
                if (cut != word.length() && isPalindrome(right)) {
                    String need = new StringBuilder(left).reverse().toString();
                    if (map.containsKey(need) && map.get(need) != i) {
                        res.add(Arrays.asList(i, map.get(need))); 
                    }
                }
            }
        }
        return res;
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode336 obj = new LeetCode336();
        String[] words = {"abcd","dcba","lls","s","sssll"};
        List<List<Integer>> ans = obj.palindromePairs(words);
        System.out.println(ans);
    }
}