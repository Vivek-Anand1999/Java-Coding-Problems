package SlidingWindow;

public class FindMaxInWindow {
    public static void main(String[] args) {
        int[] array = { 2, 5, 1, 3, 9, 8, 7 };
        int left = 0;
        int sum = 0;
        int maxSum = Integer.MAX_VALUE;
        int windowSize = 3;
        for (int right = 0; right < array.length; right++) {
            sum += array[right];
            if (right - left + 1 == windowSize) {
                maxSum = Math.min(maxSum, sum);
                sum -= array[left];
                left++;
            }
        }
        System.out.println(maxSum);
    }
}
