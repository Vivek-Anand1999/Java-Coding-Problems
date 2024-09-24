package LeetCode;

import java.util.Arrays;

public class LargestNUmber {
    public static void main(String[] args) {
        int[] array = {3, 30, 34, 5, 9};
        String[] StringArray = Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new);
        String s = largestNumber(StringArray);
        System.out.println(s);
    }

    public static String largestNumber(String[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int first;
        int second;
        int maxValue = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                first = Integer.parseInt(array[i] + array[j]);
                second = Integer.parseInt(array[j] + array[i]);
                maxValue = Math.max(first, second);
                if (first > second) {
                    continue;
                } else {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        String result = String.join("", array);
        return result;
    }
}
