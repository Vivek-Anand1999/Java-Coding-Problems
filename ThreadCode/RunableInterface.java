package ThreadCode;

class My implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println("hello");
            i++;
        }
    }

}

public class RunableInterface {
    public static void main(String[] args) {
        My m = new My();
        Thread t = new Thread(m);
        t.start();
        int j = 1;
        while (true) {
            System.out.println("world");
            j++;
        }
    }
}
