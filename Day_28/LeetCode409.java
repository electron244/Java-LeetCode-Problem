import java.util.HashSet;
import java.util.Set;

public class LeetCode409 {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int length =  0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
                length +=2;
            }else{
                set.add(ch);
            }
        }
        if(!set.isEmpty()){
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        LeetCode409 obj = new LeetCode409();
        String s = "abccccdd";
        int ans = obj.longestPalindrome(s);
        System.out.println(ans);
    }
}
