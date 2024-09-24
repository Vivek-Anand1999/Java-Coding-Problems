package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>(List.of(1, 3, 2, 4));
        List<Integer> list2 = new LinkedList<>(List.of(1, 5, 9, 8, 6, 7));
        list1.addAll(list2);
        list1.sort(Integer::compareTo); // or list1.sort(Comparator.naturalOrder());
        System.out.println(list1);

    }
}
