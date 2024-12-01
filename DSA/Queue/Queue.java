package DSA.Queue;

public class Queue {

    public static int rear = -1;
    public static int front = -1;
    public static int[] queueArray;
    public static int size;

    public Queue(int size){
        queueArray = new int[size];
        Queue.size = size;
    }

    //empty
    public boolean isEmpty(){
        return rear == front;
    }

    //full
    public boolean isFull(){
        return rear == size-1;
    }

    // enqueue
    public void enqueue(int data){
        if(!isFull()){
            rear++;
            queueArray[rear] = data;
        }else{
            System.out.println("queue is full");
        }
    }

    // dequeue
    public void deQueue(){
        if(!isEmpty()){
            front++;
            queueArray[front] = 0;
        }else{
            System.out.println("queue is empty");
        }
    }

    // print
    public void printQueue(){
        for(int value : queueArray){
            System.out.println(value);
        }
    }
}
