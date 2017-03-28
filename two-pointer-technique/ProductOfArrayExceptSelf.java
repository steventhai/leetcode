/**
 * 238
 * Given an array of n integers where n > 1, nums, return an array output,
 * such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].
 * Follow up:
 * Could you solve it with constant space complexity?
 * (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {

    /**
     * Naive solution.
     */
    public int[] productExceptSelfNaive(int[] nums) {

        int[] result = new int[nums.length];
        
        int max = 1;
        
        for (int start = 0; start < nums.length; start++) {
            int current = (start + 1) % nums.length;
            while (start != current) {
                max *= nums[current];
                current = (current + 1) % nums.length;
            }
            result[start] = max;
            max = 1;
        }

        return result;
    }

    /**
     * Two-pointer technique.
     */
    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;    
        int[] result = new int[length];
        
        int accumulate = 1;

        for (int i = 0; i < length; i++) {
            result[i] = accumulate;
            accumulate *= nums[i];
        }

        accumulate = 1;
        for (int i = length - 1; i >= 0; i--) {
            result[i] *= accumulate;
            accumulate *= nums[i];
        }

        return result;
    }
}