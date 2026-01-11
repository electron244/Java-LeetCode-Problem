import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        System.out.println(sc.isEmpty());
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        System.out.println(sc.isEmpty());
        System.out.println(sc.size());
        System.out.println(sc);
        sc.pop();
        System.out.println(sc);
        int top = sc.peek();
        System.out.println(top);
        System.out.println(sc.peek());

        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll.removeLast()); //pop in Stack
        System.out.println(ll.getLast());
        System.out.println(ll);//peek in Stack

    }
}
