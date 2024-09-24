package Array;

import java.util.Arrays;

public class RotateMatrixAnticlockwisw {
    public static void main(String[] args){

        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int matrixLength = array.length;
        System.out.println(matrixLength);
        transpose(array,matrixLength);
        reverse(array,matrixLength);
        System.out.println(Arrays.deepToString(array));

    }
    public static void transpose(int[][] array, int matrixLength){
        for (int i = 0; i < matrixLength; i++){
            for (int j = i; j < matrixLength; j++){
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }
    public static void reverse(int[][] array, int matrixLength){
        for(int i = 0; i < matrixLength; i++){
            for (int j = 0; j < matrixLength/2; j++){
                int temp = array[j][i];
                array[j][i] = array[matrixLength-j-1][i];
                array[matrixLength-j-1][i] = temp;
            }
        }
    }
}
