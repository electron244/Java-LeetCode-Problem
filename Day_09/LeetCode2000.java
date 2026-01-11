public class LeetCode2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'z';
        boolean isFound = false;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                isFound = true;
                res.append(word.substring(0, i + 1));
                res.reverse();
                res.append(word.substring(i + 1));
                break;
            }
        }
        if (isFound) {
            System.out.println(res);
        } else {
            System.out.println(word);
        }
    }
}
