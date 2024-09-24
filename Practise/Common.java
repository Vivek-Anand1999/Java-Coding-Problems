import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4,6};
        int[] arr2 = { 3, 4, 5, 6 };
        commonelement(arr1, arr2);
    }

    public static void commonelement(int[] array1, int[] array2) {
        List<Integer> list = new ArrayList<>();
        for(int x:array1){
            for (int i : array2) {
                if(x==i){
                    list.add(x);
                }
            }
        }
        System.out.println(list);
    }
    public static void comm(int[] array1,int[] array2){
        
    }
}
