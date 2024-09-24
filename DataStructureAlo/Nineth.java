package DataStructureAlo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Nineth {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 6, 8, 9, 2, 3, 4, 5 };
        System.out.println();
        Arrays.sort(array);
        findingFrequency(array);
    }

    public static void findingFrequency(int[] array) {
        Set<Integer> set1 = new HashSet<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (set1.contains(array[i])) {
                map1.put(array[i], map1.get(array[i])+1);
            } else {
                set1.add(array[i]);
                map1.put(array[i], 1);

            }
        }
        System.out.println(map1);
    }
}
