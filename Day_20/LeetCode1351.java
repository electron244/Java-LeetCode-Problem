public class LeetCode1351 {
    public int countNegatives(int[][] grid){
        int count = 0;
        for(int[] i:grid){
            for(int j = 0 ;j<i.length;j++){
                if(i[j] < 0) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        LeetCode1351 obj = new LeetCode1351();
        int[][] matrix = {{5,1,0},{-5,-5,-5}};
        int ans = obj.countNegatives(matrix);
        System.out.print(ans);

    }
}
