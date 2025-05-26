import java.util.*;

public class PriorityQueueStackQueue {

    // Simulating a Queue
    static class QueueUsingPriorityQueue {
        private PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        private int count = 0;

        public void add(int value) {
            pq.add(new int[]{count++, value});
        }

        public int remove() {
            return pq.poll()[1];
        }
    }

    // Simulating a Stack
    static class StackUsingPriorityQueue {
        private PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        private int count = 0;

        public void push(int value) {
            pq.add(new int[]{count++, value});
        }

        public int pop() {
            return pq.poll()[1];
        }
    }

    public static void main(String[] args) {
        QueueUsingPriorityQueue queue = new QueueUsingPriorityQueue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue:");
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        StackUsingPriorityQueue stack = new StackUsingPriorityQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
