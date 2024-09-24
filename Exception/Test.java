package Exception;

public class Test {
    public static void main(String[] args) {
        try {
            int result = method1(-2, 5);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int method1(int a, int b) throws Exception {
        return method2(a, b);
    }

    public static int method2(int l, int b) throws Exception {
        if (l < 0 || b < 0) {
            throw new Exception("length can not be negative");
        }
        return l * b;
    }
}
