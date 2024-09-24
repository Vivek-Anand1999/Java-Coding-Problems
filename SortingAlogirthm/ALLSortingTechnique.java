package SortingAlogirthm;

import java.util.Arrays;

public class ALLSortingTechnique {
    public static void main(String[] args) {
        int[] array = {8, 6, 3, 2, 5, 4};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int flage;
        for (int pass = 0; pass < array.length - 1; pass++) {
            flage = 0;
            for (int comp = 0; comp < array.length - 1 - pass; comp++) {
                if (array[comp] > array[comp + 1]) {
                    swap(array, comp, comp + 1);
                    flage = 1;
                }
            }
            if (flage == 0) {
                break;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int pass = 1; pass < array.length; pass++) {
            int tempData = array[pass];
            int comp = pass - 1;
            while (comp > -1 && tempData < array[comp]) {
                array[comp + 1] = array[comp];
                comp--;
            }
            array[comp + 1] = tempData;

        }
    }

    public static void selectionSort(int[] array) {
        for (int pass = 0; pass < array.length - 1; pass++) {
            int k = pass;
            int j = pass;
            while (j < array.length) {
                if (array[j] < array[k]) {
                    k = j;
                }
                j++;
            }
            int temp = array[k];
            array[k] = array[pass];
            array[pass] = temp;
        }
    }

    public static void mergeSort(int[] array) {
        int low;
        int high;
        int mid;
        int pass;
        for (pass = 2; pass <= array.length; pass = pass * 2) {
            for (int i = 0; i + pass - 1 < array.length; i = pass + i) {
                low = i;
                high = i + pass - 1;
                mid = (low + high) / 2;
                mergeList(array, low, mid, high);
            }
        }
        if (pass / 2 < array.length) {
            mergeList(array, 0, (pass / 2), array.length - 1);
        }
    }

    public static void mergeList(int[] array, int low, int mid, int high) {
        int firstPointer = low;
        int secondPointer = mid + 1;
        int mergerPointer = low;
        int[] mergedArray = new int[high + 1];
        while (firstPointer <= mid && secondPointer <= high) {
            if (array[firstPointer] < array[secondPointer]) {
                mergedArray[mergerPointer++] = array[firstPointer++];
            } else {
                mergedArray[mergerPointer++] = array[secondPointer++];
            }
        }
        for (; firstPointer <= mid; firstPointer++) {
            mergedArray[mergerPointer++] = array[firstPointer];
        }
        for (; secondPointer <= high; secondPointer++) {
            mergedArray[mergerPointer++] = array[secondPointer];
        }
        for (int i = low; i <= high; i++) {
            array[i] = mergedArray[i];
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
