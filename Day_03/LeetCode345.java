
public class LeetCode345 {
    public static void main(String[] args) {
        String s = "IceCreAm";
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        System.out.println(arr);
        while(left< right){
            while(left<right && !isVowel(arr[left])){
                left++;
            }while(left<right && !isVowel(arr[right])){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

            String result = new String(arr);
            System.out.println(result);
        }


    }
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
