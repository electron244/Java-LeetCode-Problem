public class LeetCode769 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0};
        int chunks = 0;
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            if(max == arr[i]){
                chunks++;
            }
        }
        System.out.println(chunks);
    }
}
