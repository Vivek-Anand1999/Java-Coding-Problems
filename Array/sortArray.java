package Array;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args){
        int []array = {9,5,8,7,6,3,4,1,2};
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] > array[j]){
                    swap(array,i,j);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[] array, int firstIndex, int secondIndex){
        int temp;
        temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex]= temp;
    }
}
