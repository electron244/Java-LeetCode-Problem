public class LeetCode69 {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int res = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;

            } else if (mid < x / mid) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode69 obj = new LeetCode69();
        int ans = obj.mySqrt(25);
        System.out.print(ans);
    }
}