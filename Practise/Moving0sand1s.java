import java.util.Arrays;

public class Moving0sand1s {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1};
        shifting0sAnd1s(array);
        System.out.println(Arrays.toString(array));
    }

    public static void shifting0sAnd1s(int[] array) {
        int firstIndex = 0;
        int lastIndex = array.length-1;
        while (firstIndex < lastIndex) {
            if (array[firstIndex] == 1 && array[lastIndex] == 0) {
                int temp = array[firstIndex];
                array[firstIndex] = array[lastIndex];
                array[lastIndex] = temp;
            } else {
                if (array[firstIndex] == 0) {
                    firstIndex++;
                } else {
                    lastIndex--;
                }
            }
        }
    }
}
