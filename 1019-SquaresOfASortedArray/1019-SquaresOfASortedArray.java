// Last updated: 11/08/2026, 16:09:48
class Solution {
    public int[] sortedSquares(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
             nums[i]=nums[i]*nums[i];
        }
         Arrays.sort(nums);
        return nums;
    }
}