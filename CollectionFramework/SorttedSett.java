package CollectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SorttedSett {
    public static void main(String[] args){
        SortedSet <Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(10);
        set1.add(30);
        set1.add(10);
        for (var x : set1){
            System.out.println(x);
        }
    }
}
