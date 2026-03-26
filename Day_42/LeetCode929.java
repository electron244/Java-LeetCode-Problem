import java.util.*;

public class LeetCode929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for (String email : emails) {
            int atIdx = email.indexOf('@');
            String local = email.substring(0, atIdx);
            String domain = email.substring(atIdx);
            int plusIdx = local.indexOf('+');
            if (plusIdx != -1) {
                local = local.substring(0, plusIdx);
            }
            local = local.replace(".", "");
            unique.add(local + domain);
        }
        return unique.size();
    }

    public static void main(String[] args) {
        LeetCode929 obj = new LeetCode929();
        String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };
        int ans = obj.numUniqueEmails(emails);

        System.out.println(ans);
    }
}
