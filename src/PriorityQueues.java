import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        //Priority Queue is a FIFO which serves elements of highest priority first
        Queue<Integer> queue = new PriorityQueue<Integer>(); 
        queue.offer(23);
        queue.offer(12);
        queue.offer(18);
        queue.offer(15);

        System.out.println("Original order: "+queue);

        Queue<Integer> queue2 = new PriorityQueue<Integer>(Collections.reverseOrder()); // reversing order- collections.reverseOrder()
        
        queue2.offer(23);
        queue2.offer(12);
        queue2.offer(18);
        queue2.offer(15);

        System.out.println("Reversed order: "+queue2);
        
    }
    
}
