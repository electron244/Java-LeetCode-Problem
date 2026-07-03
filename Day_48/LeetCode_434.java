public class LeetCode_434 {
    static  int countSegments(String s) {
        int count = 0;
        for (String ch : s.split(" ")) {
            if (!ch.equals(""))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello, my name is John";
        int ans = countSegments(s);
        System.out.println(ans);
    }
}