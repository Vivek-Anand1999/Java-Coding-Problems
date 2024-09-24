package Recursion;

public class DecimalToBinart {
    public static void main(String[] args) {
        int result = conversion(1);
        System.out.println(result);
    }

    public static int conversion(int number) {
        if (number == 1) {
            return 1;
        }
        return number % 2 + 10 * conversion(number / 2);
    }
}
