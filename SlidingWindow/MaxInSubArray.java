package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MaxInSubArray {
    public static void main(String[] args) {
        int[] array = {1, 3, -1, -3, 5, 3, 6, -7};
        int windowSize = 3;
        List<Integer> maxSubArray = maxSubArray(array, windowSize);
        System.out.println(maxSubArray);
    }

    public static List<Integer> maxSubArray(int[] array, int windowSize) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int minValue = Integer.MIN_VALUE;
        for (int right = 0; right < array.length; right++) {
            minValue = Math.max(array[right], minValue);
            if (right - left + 1 == windowSize) {
                list.add(minValue);
                left++;
            }
        }
        return list;
    }
}
