class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum1 = ((size) * (size + 1)) / 2;
        int sum2 = 0;
        
        for (int i : nums) {
            sum2 += i;
        }
        
        return sum1 - sum2;
    }
}