package MultiThreading;

public class example_1 extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
    }
    public static void main(String []args){
        example_1 t = new example_1();
        t.start();
        int i = 1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
}
