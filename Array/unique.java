package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class unique {
    public static void main(String[] args){
        int[] array = {2,5,6,7,9,9};
        int[] array1 = {1,1,2,3,2,9,3,4};
        findUniqueThrouSet(array1);
        boolean result = uniqueMethod (array);
        uniqueThroughdiff (array);
        if (result){
            // System.out.println("unique");
        }
        else{
            // System.out.println(" not unique");

        }
    }
    public static boolean uniqueMethod(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] == array[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void uniqueThroughdiff(int[] array){
        Integer[] IntegeArray = Arrays.stream( array ).boxed().toArray( Integer[]::new );
        List <Integer> list1 = Arrays.asList(IntegeArray);
        Set <Integer> set1 = new HashSet<>(Arrays.asList(IntegeArray));
        System.out.println(list1);
        System.out.println(set1);


        Set<Integer> you  = Arrays.stream( array ).boxed().collect( Collectors.toSet() );
        System.out.println(you);
        
    }
    public static void findUniqueThrouSet(int[] array){
        Set <Integer> set1 = new HashSet<>();
        Map <Integer,Integer> map1 = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            if (set1.contains(array[i])){
                map1.put(array[i], map1.get(array[i]) + 1);
            }
            else{
                set1.add(array[i]);
                map1.put(array[i], 1);

            }
        }
        System.out.println(set1);
        System.out.println(map1);


    }
}

/*
    // To boxed array
        Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
        Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );

    // To boxed list
        List<Integer> you  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
        List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );
 */