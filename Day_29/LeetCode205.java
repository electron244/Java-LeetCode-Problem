import java.util.HashMap;
import java.util.Map;

public class LeetCode205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sToT = new HashMap<>();
        Map<Character,Character> tToS = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char sc = s.charAt(i) , tc = t.charAt(i);
            if(sToT.containsKey(sc) && sToT.get(sc)!= tc) return false;
            if(tToS.containsKey(tc) && tToS.get(tc)!= sc) return false;

            sToT.put(sc,tc);
            tToS.put(tc,sc);
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode205 obj = new LeetCode205();
        String s = "egg";
        String t = "add";
        boolean ans = obj.isIsomorphic(s, t); 
        System.out.println(ans);
    }
}
