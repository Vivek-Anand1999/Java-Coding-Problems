package Recursion;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int result = sumNaturalNumber(3);
        System.out.println(result);
    }

    public static int sumNaturalNumber(int number) {
        if (number == 0) {
            return 0;
        }
        return number + sumNaturalNumber(number - 1);
    }
}
