public class LeetCode389 {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }

        for(char ch : t.toCharArray()){
            count[ch-'a']--;
            if(count[ch-'a'] < 0) return ch;
        }
        return ' ';
    }

    public static void main(String[] args) {
        LeetCode389 obj = new LeetCode389();
        String s = "abcd";
        String t = "abcde";
        char ans = obj.findTheDifference(s, t);
        System.out.println(ans);
    }
}