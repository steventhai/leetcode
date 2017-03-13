/**
 * 189
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * Note: Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (k > 0) {
            int length = nums.length;
            k %= length;
            int[] temp = new int[k];
            for (int i = length - k; i < length; i++) {
                temp[i - (length - k)] = nums[i];
            }
            
            int l = length - k - 1;
            int r = length - 1;
            while (l >= 0 && r >= k) {
                nums[r] = nums[l];
                r--;
                l--;
            }

            for (int i = 0; i < k; i++) {
                nums[i] = temp[i];
            }
        }
    }
}