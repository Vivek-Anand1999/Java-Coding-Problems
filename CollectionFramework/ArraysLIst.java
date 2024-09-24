package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysLIst {
    public static void main(String[] args) {
        String[] array = { "Apple", "Banana", "Cherry" };
        int[] number = { 1, 2, 3, 4, 5, 6 };
        List<String> list = Arrays.asList(array);
        for (String fruits : list) {
            System.out.println(fruits);
        }
        System.out.println(list);
        System.out.println(Arrays.toString(array));

    }
}
