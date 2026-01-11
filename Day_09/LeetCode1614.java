public class LeetCode1614 {
    public static void main(String[] args) {
        int currDepth = 0;
        int max = 0;
        String s = "(1+(2*3)+((8)/4))+1";
        for(int i = 0;i<s.length() ;i ++){
            if(s.charAt(i)=='('){
                currDepth++;
                max = Math.max(max,currDepth);
            } else if (s.charAt(i) == ')') {
                currDepth--;
            }
        }
        System.out.println(max);
    }
}
