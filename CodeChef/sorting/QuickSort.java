package CodeChef.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {11, 2, 5, 9, 8, 6, 7, 6, Integer.MAX_VALUE};
        int low = 0;
        int high = (arr.length) - 1;
        System.out.println(Arrays.toString(arr));
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        do {
            do {
                i++;
            }
            while (arr[i] <= pivot);
            do {
                j--;
            }
            while (arr[j] > pivot);
            if (i < j) {
                swap(arr, i, j);
            }
        }
        while (i < j);
        swap(arr, low, j);
        return j;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionMid = partition(arr, low, high);
            quickSort(arr, low, partitionMid);
            quickSort(arr, partitionMid + 1, high);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
