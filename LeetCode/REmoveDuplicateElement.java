package LeetCode;

public class REmoveDuplicateElement {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4 };
        int result = gettingDuplicates(array);
        System.out.println(result);
    }

    public static int gettingDuplicates(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[j]) {
                array[j] = array[i];
                j++;
            }
        }
        return j + 1;
    }
}
