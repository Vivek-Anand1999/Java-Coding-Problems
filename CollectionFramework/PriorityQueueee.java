package CollectionFramework;

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueee {
    public static void main (String[] args){
        PriorityQueue <Integer> queue1 = new PriorityQueue<>();
        queue1.offer(10);
        queue1.offer(20);
        queue1.offer(1);
        queue1.offer(9);
        queue1.offer(10);
        queue1.poll();
        queue1.forEach(x-> System.out.println(x));
    }
}
