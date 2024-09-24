package SortingAlogirthm;

import java.util.Arrays;

public class MergingTwoList {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 6};
        int[] array2 = {1, 4, 7, 8, 9};


        int[] result = mergingTwoList(array1, array2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergingTwoList(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int indexingOfFirstArray = 0;
        int indexingOfSecondArray = 0;
        int indexingOfMerggingArray = 0;
        while (indexingOfFirstArray < array1.length && indexingOfSecondArray < array2.length) {
            if (array1[indexingOfFirstArray] < array2[indexingOfSecondArray]) {
                mergedArray[indexingOfMerggingArray++] = array1[indexingOfFirstArray++];
            } else {
                mergedArray[indexingOfMerggingArray++] = array2[indexingOfSecondArray++];
            }
        }
        for (; indexingOfSecondArray < array2.length; indexingOfSecondArray++) {
            mergedArray[indexingOfMerggingArray++] = array2[indexingOfSecondArray];
        }
        for (; indexingOfFirstArray < array1.length; indexingOfFirstArray++) {
            mergedArray[indexingOfMerggingArray++] = array1[indexingOfFirstArray];
        }

        return mergedArray;

    }
}
