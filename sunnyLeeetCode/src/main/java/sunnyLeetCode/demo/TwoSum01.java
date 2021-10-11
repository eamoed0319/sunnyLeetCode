package sunnyLeetCode.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum01 {
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    listResult.add(i);
                    listResult.add(j);
                }
            }
        }
    return listResult.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}

