/**
 * 11
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis
 * forms a container, such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 */
public class ContainerWithMostWater {

    /**
     * Naive solution.
     */
     public int maxAreaNaive(int[] height) {
        int length = height.length;

        int area = 0;

       for (int i = 0; i < length - 1; i++) {
           for (int j = i + 1; j < length; j++) {
               int temp;
               if (height[j] < height[i]) {
                   temp = height[j] * (j - i);
               } else {
                   temp = height[i] * (j - i);
               }

               if (temp > area) {
                   area = temp;
               }
           }
       }

        return area;
    }

    /**
     * Two-pointer technique.
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return max;
    }
}