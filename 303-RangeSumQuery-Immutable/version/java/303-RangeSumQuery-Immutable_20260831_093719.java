// Last updated: 31/08/2026, 09:37:19
1class NumArray {
2    private int[] prefixSum;
3
4    public NumArray(int[] nums) {
5         prefixSum = new int[nums.length + 1];
6        for (int i = 0; i < nums.length; i++) {
7            prefixSum[i + 1] = prefixSum[i] + nums[i];
8        }
9    }
10    
11    public int sumRange(int left, int right) {
12        return prefixSum[right + 1] - prefixSum[left];
13    }
14}
15
16/**
17 * Your NumArray object will be instantiated and called as such:
18 * NumArray obj = new NumArray(nums);
19 * int param_1 = obj.sumRange(left,right);
20 */