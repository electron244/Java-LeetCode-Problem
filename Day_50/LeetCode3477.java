public class LeetCode3477 {
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int rem = 0;
        for(int i = 0;i<fruits.length;i++){
            boolean placed = false;
            for(int j = 0;j<baskets.length;j++){
                if(baskets[j] >= fruits[i]){
                    baskets[j] = -1;
                    placed = true;
                    break;
                }
            }
            if(!placed) rem++;
        }
        return rem;
    }
    public static void main(String[] args) {
        int[] fruits = {4,2,5};
        int[] baskets = {3,5,4};
        int ans = numOfUnplacedFruits(fruits, baskets);
        System.out.println(ans);
    }
}
