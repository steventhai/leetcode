public class TestDriver {
    
    public static void main(String[] args) {
        
        RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();
        System.out.println(test.removeDuplicates(new int[] {1, 1, 2}));
        
        TwoSum2 twoSum2 = new TwoSum2();
        int[] twoSumResult = twoSum2.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(twoSumResult[0] + " " + twoSumResult[1]);
        
        RotateArray rotateArray = new RotateArray();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(input, 3);
        for (int n : input) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Run with -ea to validate this.
        String str = "A man, a plan, a canal: Panama";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assert validPalindrome.isPalindrome(str);

        ContainerWithMostWater con = new ContainerWithMostWater();
        System.out.println(con.maxArea(new int[]{5, 2, 6, 7, 1, 8}));

        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] product = productOfArrayExceptSelf.productExceptSelf(new int[] {1, 2, 3, 4});
        for (int element : product) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}