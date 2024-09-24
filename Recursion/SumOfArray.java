package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        int result = sumOfArray(array, array.length);
        System.out.println(result);
    }

    public static int sumOfArray(int[] array, int size) {
        if (size == 0) {
            return 0;
        }
        return (sumOfArray(array, size - 1) + array[size - 1]);

    }
}
