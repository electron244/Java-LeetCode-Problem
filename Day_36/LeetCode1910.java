public class LeetCode1910 {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            int idx = s.indexOf(part);
            s = s.substring(0, idx) + s.substring(idx + part.length());
        }
        return s;
    }

    public static void main(String[] args) {
        LeetCode1910 obj  = new LeetCode1910();
        String s = "daabcbaabcbc";
        String part = "abc";
        String ans = obj.removeOccurrences(s, part);
        System.out.println(ans);
    }
}