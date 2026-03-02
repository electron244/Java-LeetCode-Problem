public class LeetCode151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        int left = 0, right = words.length - 1;

        while (left <= right) {
            res.append(words[right]);
            if (right != 0) {
                res.append(" ");
            }
            right--;
        }

        return res.toString();

    }

    public static void main(String[] args) {
        LeetCode151 obj = new LeetCode151();
        String s = "the sky is blue";
        String ans = obj.reverseWords(s);
        System.out.println(ans);
    }
}