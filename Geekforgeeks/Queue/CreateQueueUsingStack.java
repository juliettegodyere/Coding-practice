package Geekforgeeks.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

//https://www.youtube.com/watch?v=dGv0QeJf5F8
public class CreateQueueUsingStack {
     Deque<Integer> stack1;
    Deque<Integer> stack2;
   
    public CreateQueueUsingStack(Deque stack1, Deque stack2){
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    boolean isEmpty(){
        return this.stack1.isEmpty();
    }

    /* Function to push an item to stack*/
    void push(int new_data)
    {
        
    }
 
    int pop() {
        if (this.stack1.isEmpty()) {
            return -1;
        }
        return stack1.pop();
    }
    int peek() {
        if (this.stack1.isEmpty()) {
            return -1;
        }
        return stack1.peek();
    }
 
    void enQueue(int x){
        //Empty the first stack into the second one
        while(!this.stack1.isEmpty()){
            this.stack2.push(stack1.pop());
        }
        //Enqueue the element at the top of our queue
        stack1.push(x);
        //Empty the second stack into the first stack
        while(!this.stack2.isEmpty()){
            this.stack1.push(stack2.pop());
        }
    }

    int deQueue(){
        if (this.stack1.isEmpty() && this.stack2.isEmpty()) {
            return -1;
        }
        return this.stack1.pop();
    }
 
    /* Driver function to test above functions */
    public static void main(String args[])
    {
        /* Create a queue with items 1 2 3*/
        Queue q = new Queue();
        q.stack1 = new Stack<>();
        q.stack2 = new Stack<>();
        enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);
 
        /* Dequeue items */
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");
        System.out.println(deQueue(q) + " ");
    }
}
