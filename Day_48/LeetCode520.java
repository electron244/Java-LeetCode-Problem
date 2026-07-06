public class LeetCode520{
    static boolean detectCapitalUse(String word) {
        int counter = 0;
        int i = 0;
        while (i < word.length()) {
            char ch = word.charAt(i);
            if(ch>='A' && ch <= 'Z') counter++;
            i++;
        }
        if(counter == 0){
            return true;
        }else if(counter == word.length()){
            return true;
        }else if(counter == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        LeetCode520 ans = new LeetCode520();
        String input = "USA";
        System.out.println(ans.detectCapitalUse(input)); 
    }
}