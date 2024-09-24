package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Lisst {
    public static void main(String[] args) {
        // ways of defining list
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(List.of(10, 30, 60, 40, 20, 10));
        List<Integer> list3 = new ArrayList<>(4);
        list2.add(90);
        list3.add(80);
        list3.add(90);
        list3.add(10);
        throughIterator(list2);
    }

    // printing list in different ways
    public static void throughForLoop(List<Integer> l1) {
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }

    public static void throughForEach(List<Integer> l2) {
        for (var x : l2) {
            System.out.println(x);
        }
    }

    public static void throughForEachLamda(List<Integer> l3) {
        l3.forEach(y -> System.out.println(y));
    }

    public static void throughIterator(List<Integer> l4) {
        Iterator<Integer> it = l4.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
