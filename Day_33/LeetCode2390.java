
import java.util.Stack;

public class LeetCode2390 {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i) == '*'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch : st){
            res.append(ch);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        LeetCode2390 obj = new LeetCode2390();
        String s = "leet**cod*e";
        String ans= obj.removeStars(s);
        System.out.println(ans);
    }
}
