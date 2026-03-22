import java.util.Stack;

public class LeetCode3561 {
    public String resultingString(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && isConsecutive(stack.peek(), ch)){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch:stack){
            res.append(ch);
        }
        return res.toString();
    }

    public boolean isConsecutive(char a, char b) {
        int diff = Math.abs(a - b);
        return diff == 1 || diff == 25;
    }

    public static void main(String[] args) {
        LeetCode3561 obj = new LeetCode3561();
        String s = "abc";
        String ans = obj.resultingString(s);
        System.out.println(ans);
    }
}