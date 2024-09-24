package SortingAlogirthm;

import java.util.Arrays;

public class MerggingUsingSingleList {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 3, 6, 7, 10};
        merge(array);
    }

    public static void merge(int[] array) {
        int low, high, mid, firstListPointer, secondListPointer, mergedArrayPointer;
        low = 0;
        high = array.length - 1;
        mid = (low + high) / 2;
        firstListPointer = low;
        secondListPointer = mid + 1;
        mergedArrayPointer = low;
        int[] merggedArray = new int[high + 1];
        while (firstListPointer <= mid && secondListPointer <= high) {
            if (array[firstListPointer] < array[secondListPointer]) {
                merggedArray[mergedArrayPointer++] = array[firstListPointer++];
            } else {
                merggedArray[mergedArrayPointer++] = array[secondListPointer++];
            }
        }
        for (; firstListPointer <= mid; firstListPointer++) {
            merggedArray[mergedArrayPointer++] = array[firstListPointer];
        }
        for (; secondListPointer <= high; secondListPointer++) {
            merggedArray[mergedArrayPointer++] = array[secondListPointer];
        }
        System.out.println(Arrays.toString(merggedArray));
    }
}
