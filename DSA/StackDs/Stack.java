package DSA.StackDs;

public class Stack {
    public int size;
    public int top;
    int[] arrayStack;

    public Stack(int size) {
        arrayStack = new int[size];
        this.size = arrayStack.length;
        top = -1;
    }

    // Stack Full
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        return false;
    }

    //Stack Empty
    public boolean isEmpty() {
        if (top == -1 || top < size - 1) {
            return true;
        }
        return false;
    }

    // push
    public void push(int val) {
        if (!isFull()) {
            top++;
            arrayStack[top] = val;
        } else {
            System.out.println("stack is full");
        }
    }

    //pop
    public void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            arrayStack[top] = 0;
            top--;
        }
    }

    // peek
    public int peek(int pos) {
        int index = (top - pos) + 1;
        if (index < 0) {
            return -1;
        }
        return arrayStack[index];
    }
}
