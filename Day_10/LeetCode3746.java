public class LeetCode3746 {
    public static void main(String[] args) {
        String s = "aabbab";
        int countA = 0;
        int countB = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                countA++;
            }else{
                countB++;
            }
        }
        if(countB==countA) System.out.println(0);
        if(countB>countA){
            System.out.println(countB-countA);
        }else{
            System.out.println(countA-countB);
        }

    }
}
