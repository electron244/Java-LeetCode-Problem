public class LeetCode387 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i = 0;i<s.length();i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
