// Last updated: 11/08/2026, 16:12:18
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;  
            }
        }
        
         return nums.length;
    }
}