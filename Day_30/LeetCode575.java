import java.util.HashSet;
import java.util.Set;

public class LeetCode575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int candy : candyType){
            set.add(candy);
        }
        return Math.min(set.size(),candyType.length/2);
    }

    public static void main(String[] args) {
        LeetCode575 obj = new LeetCode575();
        int[] candyType = {1,1,2,2,3,3};
        int ans = obj.distributeCandies(candyType);
        System.out.println(ans);
    }
}