public class LeetCode668 {
    public int findKthNumber(int m, int n, int k) {
        int lo = 1, hi = m * n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int count = countLessOrEqual(mid, m, n);
            if (count < k)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }

    public int countLessOrEqual(int target, int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(target / i, n);
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode668 obj = new LeetCode668();
        int m = 3;
        int n = 3;
        int k = 5;
        int ans = obj.findKthNumber(m, n, k);
        System.out.println(ans);
    }
}