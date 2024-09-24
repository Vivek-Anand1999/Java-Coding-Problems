package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setss {
    public static void main(String[] args){
        Set <Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(10);
        set1.add(30);
        set1.add(10);
        
        Set <Integer> set2 = new LinkedHashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(10);
        set2.add(30);
        set2.add(10);
        for (var x : set2){
            System.out.println(x);
        }
    }
}
