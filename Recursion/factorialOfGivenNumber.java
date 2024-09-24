package Recursion;

public class factorialOfGivenNumber {
    public static void main(String[] args) {
        int result = fact(4);
        System.out.println(result);
        System.err.println();
    }

    public static int fact(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * fact(number - 1);
    }
}