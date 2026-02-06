public class LeetCode744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int left = 0,right = n;

        if(target>=letters[n-1]) return letters[0];
        while(left<right){
            int mid = left+(right-left)/2;
            if(letters[mid] <= target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return letters[left%n];
    }
    public static void main(String[] args) {
        LeetCode744 obj = new LeetCode744();
        char[] letters = {'c','f','j'};
        char target = 'a';
        char ans = obj.nextGreatestLetter(letters, target);
        System.out.println(ans);

    }
}
