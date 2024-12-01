package steamJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamJava {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 6, 2, 1, 2, 3, 7, 6, 9);
        Collections.sort(list, (a, b) -> (b - a));
//        System.out.println(list);
//        Stream.generate(() -> "hello").limit(5).peek(x -> System.out.println(x)).forEach(x -> {
//        });

        List<Integer> list1 = Arrays.asList(7, 8, 9, 4, 5, 6, 3, 2, 1, 88, 8, 9, 6, 4, 2, 3);
        List<Integer> collect = list1.stream().filter(x -> x % 2 == 0).distinct().sorted((a,b)->(b-a)).collect(Collectors.toList());
        System.out.println(collect);

    }
}
