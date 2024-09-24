package SeachingTechnique;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = { 8, 9, 4, 7, 6, 3, 10, 5, 14, 2 };
        int result = linearSearch(array, 5);
        if (result >= 0) {
            System.out.println("found at " + result);
        } else {
            System.out.println("not found");
        }
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
