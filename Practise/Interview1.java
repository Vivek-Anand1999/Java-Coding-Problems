/*
 * create a list [2,4,8,6,3]
 * you need to tell me is there is any duplicate then print duplicat present else not present
 * print how many time the elemet present
 */

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Interview1 {
    public static void main(String[] arg) {
        List<Integer> l1 = new ArrayList<>(List.of(2, 4, 8, 6, 2, 3, 6, 8, 4, 6, 2));
        Set<Integer> s1 = new HashSet<>();
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int i = 0; i < l1.size(); i++) {
            if (s1.contains(l1.get(i))) {
                m1.put(l1.get(i), m1.get(l1.get(i)) + 1);
            } else {
                s1.add(l1.get(i));
                m1.put(l1.get(i), 1);
            }
        }
        System.out.println(Arrays.asList(m1));
        for (Entry<Integer, Integer> entry : m1.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("duplicate present");
                return;
            }
        }
        System.out.println("no duplicate");
    }
}
