package Classes.InnerClass;


public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass i  = new OuterClass().new InnerClass();
        a.b j = new a.b();
    }
}

class OuterClass{
    int y = 10;

    class InnerClass{
        int x = 20;
        public void display(){
            System.out.println(y);
        }
    }
    public void test(){
        InnerClass innerClass = new InnerClass();
        // System.out.println(x);
    }
}

class a{
    int c = 30;

    static class b{
        int k = 9;
    }
}