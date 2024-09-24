import java.util.Arrays;
import java.util.List;
public class Array_copy {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array1 = {7,8,9};
        int[] mergedArray = new int[array.length + array1.length];
        System.arraycopy(array, 0, mergedArray, 0, array.length);
        System.arraycopy(array1, 0, mergedArray, array.length, array1.length);
        System.out.println(Arrays.toString(mergedArray));
        Integer[] arr = Arrays.stream(mergedArray).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(arr);
    }
}
