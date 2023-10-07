package OCP.Chapter9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        System.out.println(deque.offerFirst(10));
        System.out.println(deque.offerLast(4));

        System.out.println("Peeking first then last");
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println("Polling first then last, then first then last");
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque.pollFirst());
        System.out.println(deque.peekFirst());


        System.out.println("\n\n\n===================Stack Time==========================");

        Deque<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.poll());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
