import java.util.ArrayList;

public class IndexOfSubArraySum {
    public static void main(String[] args) {
        int[] array = {5,3,4};
        ArrayList<Integer> results = findIndexOfSubArray(array, array.length, 2);
        System.out.println(results);
    }

    public static ArrayList<Integer> findIndexOfSubArray(int[] array, int lengthOfArray, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int sum;
        for (int i = 0; i < lengthOfArray; i++) {
            sum = array[i];
            for (int j = i+1; j < lengthOfArray; j++) {
                if(sum == target){
                    result.add(i+1);
                    result.add(j);
                    return result;
                }
                sum += array[j];
                if (sum == target) {
                    result.add(i + 1);
                    result.add(j + 1);
                    return result;
                }
                if(sum > target){
                    break;
                }
            }
        }
        result.add(-1);
        return result;
    }
}
