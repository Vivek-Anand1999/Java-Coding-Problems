package CodeChef.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,7,6,2,5,4,3,9};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int[] arr){
        for(int pass = 0; pass < arr.length-1; pass++){
            boolean flag = false;
            for(int comp = 0; comp < arr.length-1-pass; comp++){
                if(arr[comp] > arr[comp+1]){
                    swap(arr, comp, comp+1);
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
