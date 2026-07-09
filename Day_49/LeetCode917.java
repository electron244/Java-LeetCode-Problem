public class LeetCode917{
     public static String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(left<right){
            if(Character.isLetter(sb.charAt(left)) && Character.isLetter(sb.charAt(right))){
                char temp = sb.charAt(right);
                sb.setCharAt(right,sb.charAt(left));
                sb.setCharAt(left,temp);
                left++;
                right--;
            }else if(!Character.isLetter(sb.charAt(left))){
                left++;
            }else{
                right--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        LeetCode917 obj = new LeetCode917();
        String s= "a-bC-dEf-ghIj";
        String ans = obj.reverseOnlyLetters(s);
        System.out.println(ans);
    }
}