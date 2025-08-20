import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // Step 1: Mark visited numbers
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1; 
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Step 2: Collect missing numbers
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
