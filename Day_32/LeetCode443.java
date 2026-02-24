public class LeetCode443 {
     public int compress(char[] chars) {
        int write = 0, i = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            chars[write++] = currentChar;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
    public static void main(String[] args) {
        LeetCode443 obj = new LeetCode443();
        char[] chars = {'a','a','b','b','c','c','c'};
        int ans = obj.compress(chars);
        System.out.println(ans);
    }
}
