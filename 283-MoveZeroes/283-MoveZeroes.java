// Last updated: 11/08/2026, 16:12:15
class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        
         for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }
        
         while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}