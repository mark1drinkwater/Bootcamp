package OCP.Chapter9;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(4);
        queue.offer(20);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
