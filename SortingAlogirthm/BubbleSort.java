package SortingAlogirthm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // int[] array = { 8, 5, 7, 3, 2 };
        int[] array = { 1, 2, 3, 4, 5 };

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int flag;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            flag = 0;
            for (int j = 0; j < arrayLength - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
