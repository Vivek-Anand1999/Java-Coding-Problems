package DataStructureAlo;

import java.util.ArrayList;
import java.util.List;

public class Eight {
    public static void main(String[] args) {
        int[] array = { 1, 5, 9, 8, 3, 2 };
        List<Integer> result = secondLargest(array);
        System.out.println(result);
        List<Integer> l1 = new ArrayList<>(List.of(8,7,9));
        result.addAll(l1);
        System.out.println(result);
    }

    public static List<Integer> secondLargest(int[] array) {
        List<Integer> list1 = new ArrayList<>();
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                third = second;
                second = first;
                first = array[i];
            } else if (array[i] > second && array[i] != first) {
                third = second;
                second = array[i];
            } else if (array[i] > third && array[i] != second) {
                third = array[i];
            }
        }
        list1.add(first);
        list1.add(second);
        list1.add(third);
        return list1;
    }
}
