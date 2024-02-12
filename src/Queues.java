import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>(); //this is a FIFO datastructure
        queue.offer("Joseph");
        queue.offer("Alexander");
        queue.offer("Anthony");
        queue.offer("Maxwell");
        queue.offer("Erlin");

        System.out.println(queue);
        System.out.println(queue.peek()); // check for item at the head of the queue

        //poll the queue
        queue.poll();
        System.out.println(queue);
    }
    
}
