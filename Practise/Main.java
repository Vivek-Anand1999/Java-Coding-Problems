
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        singleDemArray sdm = new singleDemArray();
        for (int i = 0; i < sdm.arr.length; i++) {
            sdm.arr[i] = Integer.MIN_VALUE;
        }
        for (int x : sdm.arr) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(sdm.arr));

        List<Integer> l1 = new LinkedList<>(Arrays.asList(4, 8, 9, 6, 3, 2));
        System.out.println(l1.toString());
    }
}
