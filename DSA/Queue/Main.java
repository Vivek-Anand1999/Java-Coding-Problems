package DSA.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(56);
        queue.printQueue();
        System.out.println(Queue.size);
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
    }
}
