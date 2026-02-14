
import java.util.HashSet;

public class LeetCode1346 {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num*2) || (num%2==0 && set.contains(num/2)))
                return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode1346 obj = new LeetCode1346();
        int[] arr ={10,2,5,3};
        boolean ans = obj.checkIfExist(arr);
        System.out.println(ans);
  }
}