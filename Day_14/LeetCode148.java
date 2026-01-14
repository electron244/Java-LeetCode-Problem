
import java.util.Arrays;

public class LeetCode148 {

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

    public ListNode sortList(ListNode head) {
        int len = 0;
        if (head == null || head.next == null) {
            return null;
        }
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        curr = head;
        int[] array = new int[len];
        int k = 0;
        while (curr != null) {
            array[k] = curr.val;
            curr = curr.next;
            k++;
        }
        Arrays.sort(array);
        ListNode newHead = new ListNode(array[0]);
        ListNode current = newHead;
        for (int i = 1; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        LeetCode148 obj = new LeetCode148();
        ListNode list = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNode ans = obj.sortList(list);
        while (ans != null) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
}
