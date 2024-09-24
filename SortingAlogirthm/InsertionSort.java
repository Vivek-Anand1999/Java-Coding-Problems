package SortingAlogirthm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 8, 7, 5, 3, 2 };
        insertionSort(array, 5);
        System.out.println(Arrays.toString(array));

    }

    public static void insertionSort(int[] array, int n) {
        for (int i = 1; i < n; i++) {
            int tempData = array[i];
            int j = i - 1;
            while (j > -1 && array[j] > tempData) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tempData;
        }
    }
}
