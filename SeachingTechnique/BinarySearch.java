package SeachingTechnique;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 4, 8, 10, 15, 18, 21, 24, 27, 29, 33, 34, 37, 39, 41, 43 };
        int result = binarySearch(array, 25);
        if (result >= 0) {
            System.out.println("found at index --> " + result);
        } else {
            System.out.println("Not found at index --> ");

        }
    }

    public static int binarySearch(int[] array, int key) {
        int lowIndex = 0;
        int highIndex = array.length;
        while (lowIndex <= highIndex) {
            int minIndex = ((lowIndex + highIndex) / 2);
            if (key == array[minIndex]) {
                return minIndex;
            } else if (key < array[minIndex]) {
                highIndex = minIndex - 1;
            } else {
                lowIndex = minIndex + 1;
            }
        }
        return -1;
    }
}