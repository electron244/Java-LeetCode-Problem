import java.util.Stack;
public class LeetCode921{

    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }else if(st.peek() == '(' && ch == ')'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return st.size()
;    }
    public static void main(String[] args) {
        LeetCode921 obj = new LeetCode921();
        String s = "(((";
        int ans = obj.minAddToMakeValid(s);
        System.out.println(ans);
    }
}