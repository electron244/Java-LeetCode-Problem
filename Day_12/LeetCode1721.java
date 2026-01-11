
public class LeetCode1721 {

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    // Main method to swap nodes
    public ListNode swapNodes(ListNode head, int k) {
        // Convert linked list to array
        int[] array = linkedListToArray(head);

        // Swap the kth element from beginning and kth from end
        int temp;
        int start = array[k - 1];              // k is 1-indexed
        int end = array[array.length - k];

        temp = start;
        array[k - 1] = end;
        array[array.length - k] = temp;

        // Convert array back to linked list
        head = new ListNode(array[0]);
        ListNode current = head;

        for (int i = 1; i < array.length; i++) {
            ListNode newNode = new ListNode(array[i]);
            current.next = newNode;
            current = current.next;
        }

        return head;
    }

    // Helper method: Convert linked list to array
    public int[] linkedListToArray(ListNode head) {
        if (head == null) {
            return new int[0];
        }

        // Count nodes
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Fill array
        int[] arr = new int[length];
        current = head;
        int i = 0;
        while (current != null) {
            arr[i] = current.val;
            i++;
            current = current.next;
        }
        return arr;
    }

    // Helper method: Print linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" → ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LeetCode1721 obj = new LeetCode1721();

        // Test Case 1
        System.out.println("Test Case 1:");
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        System.out.print("Original: ");
        printList(head1);

        int k1 = 2;
        ListNode result1 = obj.swapNodes(head1, k1);
        System.out.print("After swapping k=" + k1 + ": ");
        printList(result1);
        System.out.println("Expected: 1 → 4 → 3 → 2 → 5");
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        ListNode head2 = new ListNode(7, new ListNode(9, new ListNode(6,
                new ListNode(6, new ListNode(7, new ListNode(8,
                        new ListNode(3, new ListNode(0, new ListNode(9,
                                new ListNode(5))))))))));
        System.out.print("Original: ");
        printList(head2);

        int k2 = 5;
        ListNode result2 = obj.swapNodes(head2, k2);
        System.out.print("After swapping k=" + k2 + ": ");
        printList(result2);
        System.out.println("Expected: 7 → 9 → 6 → 6 → 8 → 7 → 3 → 0 → 9 → 5");
        System.out.println();

        // Test Case 3
        System.out.println("Test Case 3:");
        ListNode head3 = new ListNode(1);
        System.out.print("Original: ");
        printList(head3);

        int k3 = 1;
        ListNode result3 = obj.swapNodes(head3, k3);
        System.out.print("After swapping k=" + k3 + ": ");
        printList(result3);
        System.out.println("Expected: 1");
        System.out.println();

        // Test Case 4
        System.out.println("Test Case 4:");
        ListNode head4 = new ListNode(1, new ListNode(2));
        System.out.print("Original: ");
        printList(head4);

        int k4 = 1;
        ListNode result4 = obj.swapNodes(head4, k4);
        System.out.print("After swapping k=" + k4 + ": ");
        printList(result4);
        System.out.println("Expected: 2 → 1");
    }
}

