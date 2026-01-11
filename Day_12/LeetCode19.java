public class LeetCode19 {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method to remove nth node from end
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode current = head;

        // Step 1: Calculate length
        while (current != null) {
            length++;
            current = current.next;
        }

        int pos = length - n;

        // Step 2: If removing head
        if (pos == 0) {
            return head.next;
        }

        // Step 3: Traverse to node before target
        current = head;
        for (int i = 0; i < pos - 2; i++) {
            current = current.next;
        }

        // Step 4: Remove node
        current.next = current.next.next;

        return head;
    }

    // Utility method to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LeetCode19 obj = new LeetCode19();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4,
                new ListNode(5)))));

        System.out.print("Original List: ");
        printList(head);

        // Remove 2nd node from end
        head = obj.removeNthFromEnd(head, 2);

        System.out.print("After Removal: ");
        printList(head);
    }
}
