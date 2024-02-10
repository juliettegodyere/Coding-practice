package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElementsOfQueue {
    static public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Deque<Integer> stack = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        // Push the first 'k' elements onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(q.peek());
            q.remove();
        }

        // Pop elements from the stack and enqueue them to the queue
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        // Enqueue the remaining elements from the original queue
        while (!q.isEmpty()) {
            queue.offer(q.peek());
            q.remove();
        }

        return queue;
    }

    //Optimized solution
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue2(Queue<Integer> q, int k) {
        // Use Deque as both stack and queue
        Deque<Integer> deque = new LinkedList<>();

        // Push the first 'k' elements onto the deque
        for (int i = 0; i < k; i++) {
            deque.addLast(q.poll());
        }

        // Pop elements from the deque and enqueue them to the queue
        while (!deque.isEmpty()) {
            q.add(deque.removeLast());
        }

        // Enqueue the remaining elements from the original queue
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }

        return q;
    }
    public static void main(String args[]) 
	{ 
		Queue<Integer> queue =  new LinkedList<>();
		queue.add(1); 
		queue.add(2); 
		queue.add(3); 
		queue.add(4); 
        queue.add(5); 
	
		System.out.println(modifyQueue(queue, 3));
	} 
}
