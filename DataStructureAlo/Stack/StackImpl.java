package DataStructureAlo.Stack;

public class StackImpl {
    int[] stack;
    int pointer;
    int i = 0;

    public StackImpl(int size) {
        this.stack = new int[size];
        this.pointer = -1;
        System.out.println("size of stack is " + size);
    }

    public void push(int value) {
        boolean full = isFull();
        if (!full) {
            stack[i] = value;
            i++;
            pointer++;
        } else {
            System.out.println("Stack is full");
        }

    }

    public boolean isFull() {
        if (pointer == stack.length - 1) {
            System.out.println("Stack is full");
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        for (int x : stack) {
            System.out.println(x);
        }
    }
}
