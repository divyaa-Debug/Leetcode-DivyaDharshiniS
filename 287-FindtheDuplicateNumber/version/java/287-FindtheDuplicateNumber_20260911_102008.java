// Last updated: 11/09/2026, 10:20:08
1class Solution {
2    public int findDuplicate(int[] nums) {
3         int tortoise = nums[0];
4        int hare = nums[0];
5
6        do {
7            tortoise = nums[tortoise];
8            hare = nums[nums[hare]];
9        } while (tortoise != hare);
10
11         tortoise = nums[0];
12        while (tortoise != hare) {
13            tortoise = nums[tortoise];
14            hare = nums[hare];
15        }
16
17        return hare;
18    }
19}