public class LeetCode32 {
    public static void main(String[] args) {
        String s = "(()";
        //String s = ")()())";
        //String s = "";
        int left = 0;
        int right = 0;
        int max = 0; //to store final answer
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                max = Math.max(max, left * 2);
            } else if (right > left) {
                left = right = 0;
            }
            left = right = 0;
        }

        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) == ')') {
                right++;
            } else {
                left++;
            }
            if (left == right) {
                max = Math.max(max, left * 2);
            } else if (left > right) {
                left = right = 0;
            }

        }

        System.out.println(max);
    }
}
