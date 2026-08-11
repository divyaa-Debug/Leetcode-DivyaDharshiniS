// Last updated: 11/08/2026, 16:15:08
class Solution {
    public void sortColors(int[] nums) {
        int zeroIndex = 0, twoIndex = nums.length - 1, i = 0;
        while (i <= twoIndex) {
            if (nums[i] == 2) {
                nums[i] = nums[twoIndex];
                nums[twoIndex--] = 2;
            } else {
                if (nums[i] == 0) {
                    nums[i] = nums[zeroIndex];
                    nums[zeroIndex++] = 0;
                } 
                i++;
            }
        }
    }
}