package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInsideList {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4 };
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    if (result.contains(Arrays.asList(nums[i], nums[j], nums[k]))) {
                        j++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;

                    }
                }
                k--;
            }
        }
        System.out.println(result);
    }
}
