package Recursion;

public class PrintNUmberInReverse {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int number) {
        if (number < 0) {
            return;
        }
        System.out.println(number);
        print(number - 1);
    }
}
