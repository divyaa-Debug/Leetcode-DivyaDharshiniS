// Last updated: 17/09/2026, 10:04:25
1public class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3        Map<Integer, Integer> sumMap = new HashMap<>();
4        int count = 0;
5
6         for (int i : nums1) {
7            for (int j : nums2) {
8                int sum = i + j;
9                sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
10            }
11        }
12
13         for (int k : nums3) {
14            for (int l : nums4) {
15                int target = -(k + l);
16                if (sumMap.containsKey(target)) {
17                    count += sumMap.get(target);
18                }
19            }
20        }
21
22        return count;
23    }
24}