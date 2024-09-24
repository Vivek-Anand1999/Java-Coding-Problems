import java.util.Arrays;

public class ConcationOfArray {
    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 1 };
        int[] newArray = concatArray(array);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] concatArray(int[] array) {
        int j = 0;
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[j];
                j++;
            }
        }
        return newArray;
    }
}
