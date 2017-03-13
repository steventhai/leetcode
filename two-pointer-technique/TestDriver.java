public class TestDriver {
    
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();
        System.out.println(test.removeDuplicates(new int[] {1, 1, 2}));
        TwoSum2 twoSum2 = new TwoSum2();
        int[] twoSumResult = twoSum2.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(twoSumResult[0] + " " + twoSumResult[1]);
    }

}