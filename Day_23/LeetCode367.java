public class LeetCode367 {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;

        long left = 1, right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LeetCode367 obj = new LeetCode367();
        int num = 25;
        boolean ans = obj.isPerfectSquare(num);
        System.out.print(ans);
    }
}