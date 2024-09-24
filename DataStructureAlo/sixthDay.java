package DataStructureAlo;

/**
 * ! Finding Factorial of n numbers
 * ! power
 */
public class sixthDay {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int result = sum(array, array.length - 1);
        System.out.println(result);
    }

    public static int power(int base, int exp) { // 2 4
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        } else {
            return base * power(base, exp - 1);
        }
    }

    public static int sum(int[] array, int length) {
        if (length == 0) {
            return array[length];
        }
        return array[length] + sum(array, length - 1);
    }
}
