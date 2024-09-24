package Recursion;

public class StringReverse {
    public static void main(String[] args) {
        String input = "vivek";
        reverseString(input, input.length() - 1);
    }

    public static int reverseString(String input, int size) {
        if (size < 0) {
            return -1;

        }
        System.out.print(input.charAt(size));
        return reverseString(input, size - 1);
    }
}
