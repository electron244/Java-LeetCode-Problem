import java.util.Stack;

public class LeetCode394 {
    public static void main(String[] args) {
        //String s = "3[a]2[bc]";
        String s = "3[a2[c]]";
        Stack<Integer> stack = new Stack<>();
        Stack<StringBuilder> string = new Stack<>();
        StringBuilder res = new StringBuilder();
        int num = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                stack.push(num);
                num = 0;
                string.push(res);
                res = new StringBuilder();
            } else if (ch == ']') {
                int k = stack.pop();
                StringBuilder temp = res;
                res = string.pop();
                while(k-- > 0){
                    res.append(temp);
                }
            } else{
                res.append(ch);
            }
        }
        System.out.println(res.toString());

    }
}
