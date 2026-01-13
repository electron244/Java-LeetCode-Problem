
import java.util.Stack;

public class LeetCode445 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;

        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while (l1 != null) {
            st1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            st2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        while (!st1.isEmpty() || !st2.isEmpty() || carry > 0) {
            int a = st1.isEmpty() ? 0 : st1.pop();
            int b = st2.isEmpty() ? 0 : st2.pop();
            int sum = a + b + carry;
            carry = sum / 10;
            int digit = sum % 10;
            ListNode newNode = new ListNode(digit);
            newNode.next = result;
            result = newNode;
        }

        return result;
    }

    public static void main(String[] args) {
        LeetCode445 obj = new LeetCode445();
        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode ans = obj.addTwoNumbers(l1, l2);
        while (ans != null) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
}
