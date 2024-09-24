package Array;

import java.util.Arrays;

public class TwoDArrayRotaionl90Rotate {
    public static void main (String[] args){
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int matrixLength = array.length;
        transpose(array, matrixLength);
        reverse(array, matrixLength);
        System.out.println(Arrays.deepToString(array));

    }
    public static void transpose(int[][] array, int matrixLength ){
        for (int i = 0; i < matrixLength; i++){
            for (int j = i; j < matrixLength; j++){
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;

            }
        }
    }
    public static void reverse(int[][] array, int matrixLength){
        for (int i = 0; i < matrixLength; i++){
            for (int j = 0; j < matrixLength/2; j++){
                int temp = array[i][j];
                array[i][j] = array[i][matrixLength-j-1];
                array[i][matrixLength - j - 1] = temp;
            }
        }

    }
    
}
