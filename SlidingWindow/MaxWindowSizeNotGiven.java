package SlidingWindow;

public class MaxWindowSizeNotGiven {
    public static void main(String[] args) {
        int[] array = {4, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1};
        int sum = 6;
        int result = findWindow(array, sum);
        System.out.println(result);
    }

    public static int findWindow(int[] array, int total) {
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < array.length; right++) {
            sum += array[right];
            if (sum == total) {
                int windowSize = right - left + 1;
                maxValue = Math.max(windowSize, maxValue);
                left++;
                sum = 0;
                right = left - 1;
            }
            if (sum > total) {
                left++;
                right = left - 1;
                sum = 0;
            }
        }
        return maxValue;
    }
}
