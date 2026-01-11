import java.util.Stack;
public class LeetCode2696 {
    public static void main(String[] args) {
        String s = "ACBBD";
        Stack<Character> st = new Stack<>();
        //char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(st.isEmpty()){
                st.push(s.charAt(i));
            } else if ((st.peek() == 'A' && s.charAt(i) == 'B') || st.peek() == 'C' && s.charAt(i) == 'D') {
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        System.out.println(st.size());
    }
}
