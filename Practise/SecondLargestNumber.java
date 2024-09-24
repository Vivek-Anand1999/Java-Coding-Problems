import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = { 0, 0, -1, -1, 2, -15, 11, 11, 12, 10 };
        Arrays.sort(array);
        int result = secondLargestNumber(array);
        System.out.println(result);
    }

    public static int secondLargestNumber(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = 0;
        int thirdLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = array[i];
            }
        }
        if (firstLargest > secondLargest && firstLargest != secondLargest) {
            if (secondLargest > thirdLargest && secondLargest != thirdLargest) {
                // return thirdLargest;
            }
            return firstLargest;
        }
        return -1;
    }
}
