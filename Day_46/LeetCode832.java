public class LeetCode832 {
    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {

            int left = 0, right = image[i].length - 1;
            while (left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }

            for (int j = 0; j < image[i].length; j++) {
                image[i][j] ^= 1;
            }
        }

        return image;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(matrix);
        for(int[] i:ans){
            for(int j : i){
                System.out.println(j);
            }
        }
    }
}
