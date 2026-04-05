public class LeetCode557 {
    static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }
        return new String(arr);
    }

    static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
