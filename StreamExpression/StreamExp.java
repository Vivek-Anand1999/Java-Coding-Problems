package StreamExpression;

import java.util.ArrayList;
import java.util.List;

public class StreamExp {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Aditay");
        list1.add("suman");
        list1.add("Aman");
        list1.add("Kashiv");
        list1.add("Don");
        Long ratio = list1.stream().filter(s -> s.startsWith("A")).count();
        list1.stream().filter(x -> x.length() > 4).forEach(x -> System.out.println(x));

    }
}
