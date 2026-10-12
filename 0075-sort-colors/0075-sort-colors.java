class Solution {
    public void sortColors(int[] nums) {
        int size = nums.length, temp;
        int low = 0, mid = 0, high = size - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}