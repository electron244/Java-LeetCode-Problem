import java.util.Stack;

public class LeetCode2487 {
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

    public ListNode removeNodes(ListNode head) {
        ListNode current = head;
        Stack<ListNode> stack = new Stack<>();
        while (current != null) {
            while (!stack.isEmpty() && stack.peek().val < current.val) {
                stack.pop();
            }
            stack.push(current);
            current = current.next;
        }

        ListNode next = null;
        while (!stack.isEmpty()) {
            current = stack.pop();
            current.next = next;
            next = current;
        }
        return current;
    }

    public static void main(String[] args) {
        LeetCode2487 obj = new LeetCode2487();
        ListNode list = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
        ListNode ans = obj.removeNodes(list);
        while (ans != null) {
            System.out.print(ans.val + "->");
            if (ans.next == null)
                System.out.print("null");
            ans = ans.next;
        }
    }
}
