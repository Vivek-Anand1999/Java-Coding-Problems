package CodeChef;

import java.util.*;

public class DistinctK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("enter the size");
        size = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[size];
        String input;
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter string");
            input = scanner.nextLine();
            array[i] = input;
        }
        int k;
        System.out.println("enter k ");
        k = scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (String s : array) {
            if (!set.contains(s)) {
                set.add(s);
                map.put(s, map.size() + 1);
            } else {
                set.remove(s);
                map.remove(s);
            }
        }
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == k) {
                System.out.println(entry.getKey());
            }
        }
    }
}
