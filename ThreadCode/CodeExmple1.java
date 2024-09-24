package ThreadCode;

//! using thread class
class MyThread extends Thread {
    @Override
    public void run() {
        // int i = 1;
        // while (true) {
        // System.out.println("hello");
        // i++;
        // }
    }
}

public class CodeExmple1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        System.out.println(myThread.getId());
        // myThread.start();
        int j = 1;
        // while (true) {
        // System.out.println("world");
        // j++;
        // }
    }
}
