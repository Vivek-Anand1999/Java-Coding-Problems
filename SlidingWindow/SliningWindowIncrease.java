package SlidingWindow;

public class SliningWindowIncrease {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-5,-3};
        int k = 2;  // Example fixed-size window
        System.out.println("Minimum sum of subarray of size " + k + ": " + findMinSumSubarray(arr, k));
    }

    public static int findMinSumSubarray(int[] arr, int k) {
        if (arr.length < k) {
            throw new IllegalArgumentException("Array length must be greater than or equal to the window size.");
        }

        // Compute the sum of the first window
        int current_sum = 0;
        for (int i = 0; i < k; i++) {
            current_sum += arr[i];
        }

        int min_sum = current_sum;

        // Slide the window from start to end
        for (int i = k; i < arr.length; i++) {
            current_sum = current_sum - arr[i - k] + arr[i];
            min_sum = Math.min(min_sum, current_sum);
        }

        return min_sum;
    }
}
