package Recursion;

public class PrintingStar {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        if (n == 1) {
            System.out.println("*");
            return;
        } else {
            System.out.println("*");
            print(n - 1);
        }
    }
}
