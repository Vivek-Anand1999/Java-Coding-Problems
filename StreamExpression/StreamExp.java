package StreamExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExp {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Aditay");
        list1.add("suman");
        list1.add("Aman");
        list1.add("Kashiv");
        list1.add("Don");
//        Long ratio = list1.stream().filter(s -> s.startsWith("A")).count();
//        list1.stream().filter(x -> x.length() > 4).forEach(x -> System.out.println(x));

//        List<Integer> l1 =new ArrayList<>(Li
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> li = numbers.stream().filter(index -> index % 2 == 0).map(index -> index * 2).collect(Collectors.toList());
        System.out.println(li);
        Map<Character,Long> l2 = list1.stream().collect(Collectors.groupingBy(name->name.charAt(0),Collectors.counting()));
        System.out.println(l2);
    }
}
