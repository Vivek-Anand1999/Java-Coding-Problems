package Array;

import java.util.Arrays;

public class twoSum {
    public static void main(String []args){
        int []array = {1,2,3,7,6,8};
        int target = 9;
        int[] res = twoSoum(array,target);
        System.out.println(Arrays.toString(res));
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]+array[j] == target){
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
    }
    public static int[] twoSoum(int[] arr, int targetValue){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == targetValue){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
