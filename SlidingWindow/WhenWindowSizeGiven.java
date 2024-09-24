package SlidingWindow;

/*
 * THis is when window size is given supoose  k = 3 ()
 */
public class WhenWindowSizeGiven {
    public static void main(String[] args) {
        int[] array = { 2, 5, 1, 8, 2, 9, 1 };
        int k = 3;
        int sum = 0;
        int left = 0;
        int right = 0;
        int maxStartIndex = 0; // To store the starting index of the maximum sum subarray
        int maxEndIndex = 0; // To store the ending index of the maximum sum subarray
        int maxSum = Integer.MIN_VALUE;
        Math.max(left, right);
        for (right = 0; right < array.length; right++) {
            sum += array[right];
            if (right - left + 1 == k) {// three window completed and save the output
                if (sum > maxSum) {
                    maxSum = sum;
                    maxStartIndex = left; // Update the starting index of the maximum sum subarray
                    maxEndIndex = right;
                }
                sum = sum - array[left];
                left++;
            }
        }
        System.out.println("Maximum sum of subarray with size " + k + ": " + maxSum);
        System.out.println("Indices of maximum sum subarray: " + maxStartIndex + " to " + maxEndIndex);

    }
}
