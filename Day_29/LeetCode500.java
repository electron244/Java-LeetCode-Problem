import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode500{
     public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        Map<Character,Integer> map = new HashMap<>();

        for(int i  = 0;i<rows.length;i++){
            for(char ch : rows[i].toCharArray()){
                map.put(ch,i);
            }
        }
        List<String> result = new ArrayList<>();
        for(String word : words){
            int targetRow = map.get(Character.toLowerCase(word.charAt(0)));
            boolean valid = true;
            for (char c : word.toCharArray()) {
                if (map.get(Character.toLowerCase(c)) != targetRow) {
                    valid = false;
                    break;
                }
            }
            if (valid) result.add(word);
        }
        return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        LeetCode500 obj = new LeetCode500();
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] ans = obj.findWords(words);
        for(String word : ans){
            System.out.println(word);
        }
    }
}