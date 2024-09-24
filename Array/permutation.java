package Array;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args){
        int[] array1 = {2,1,3,5,4,6};
        int[] array2 = {1,3,2,4,6,5};
        List <Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
        List <Integer> list2 = new ArrayList<>(List.of(1,2,3,4,5,2));
        System.out.println(list1.containsAll(list2));

        boolean result = arrayChecker(array1,array2);
        if(result){
            System.out.println("permutation");
        }
        else{
            System.out.println("not permutaion");
        }
        boolean containsAll = containsAllWithDuplicates(list1, list2);
        System.out.println("c-->" + containsAll); 
    }
    public static boolean arrayChecker(int[] array1, int[] array2){
        if (array1.length != array2.length){
            return false;
        }
        else{
            for (int i = 0; i < array1.length; i++){
                for (int j = 0; j < array2.length; j++){
                   if (array1[i] == array2[j]){

                   }
                }

            }
            return true;
        }
    }
    public static boolean containsAllWithDuplicates(List<Integer> list1, List<Integer> list2) {
        List<Integer> tempList = new ArrayList<>(list1);
        for (Integer element : list2) {
            if (tempList.contains(element)) {
                tempList.remove(element);
            } else {
                return false;
            }
        }
        return true;
    }
}
