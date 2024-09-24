package DataStructureAlo;

import java.util.Arrays;

public class seventhDay {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 5, 4, 3, 2, 1 };
        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean result = checkArrayElements(array1, array2);
        if (result) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }

    public static boolean checkArrayElements(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                return true;
            }
        }
        return false;
    }
}
