/**
 * 167
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. 
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (numbers[i] + numbers[j] != target) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[] {++i, ++j};
    }

    public int[] twoSumBinarySearch(int[] numbers, int target) {
        
        for (int i = 0; i < numbers.length - 1; i++) {
            int left = i + 1;
            int right = numbers.length - 1;
            int result = target - numbers[i];

            while (left <= right) {
                int mid = (left + right) / 2;
                if (result == numbers[mid]) return new int[] {i + 1, mid + 1};
                else if (result > numbers[mid]) left = mid + 1;
                else right = mid - 1;
            }
        }

        return new int[]{};
    }
}