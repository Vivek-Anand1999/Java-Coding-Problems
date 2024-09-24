package Recursion;

public class SumOfNUmber {
    public static void main(String[] args) {
        int result = fun(110);
        System.out.println(result);
    }

    public static int fun(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + fun(n / 10);
    }
}
