import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode1019 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int[] values = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            values[i] = list.get(i);
        }

        int[] result = new int[list.size()];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < values.length; i++) {
            while (!stack.isEmpty() && values[stack.peek()] < values[i]) {
                result[stack.pop()] = values[i];
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        LeetCode1019 obj = new LeetCode1019();
        ListNode head = new ListNode(2, new ListNode(1, new ListNode(5)));
        int[] ans = obj.nextLargerNodes(head);
        for (int num : ans) {
            System.out.println(num);
        }
    }
}