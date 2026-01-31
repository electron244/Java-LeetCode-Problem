public class LeetCode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0;
        int hi = m * n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int val = matrix[mid / n][mid % n];
            if (target == val) {
                return true;
            } else if (val < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode74 obj = new LeetCode74();
        int target = 3;
        int[][] matrix = {
                { 1, 3, 5 },
                { 7, 9, 11 },
                { 13, 15, 17 }
        };
        boolean ans = obj.searchMatrix(matrix, target);
        System.out.print(ans);
    }
}
