// Last updated: 11/09/2026, 09:34:32
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3 
4         Map<Integer, Long> minPrefixSum = new HashMap<>();
5        
6        long prefixSum = 0;
7        long maxGoodSum = Long.MIN_VALUE;
8        boolean foundGoodSubarray = false;
9
10        for (int num : nums) {
11             if (minPrefixSum.containsKey(num - k)) {
12                long currentSum = prefixSum + num - minPrefixSum.get(num - k);
13                maxGoodSum = Math.max(maxGoodSum, currentSum);
14                foundGoodSubarray = true;
15            }
16
17             if (minPrefixSum.containsKey(num + k)) {
18                long currentSum = prefixSum + num - minPrefixSum.get(num + k);
19                maxGoodSum = Math.max(maxGoodSum, currentSum);
20                foundGoodSubarray = true;
21            }
22
23             if (!minPrefixSum.containsKey(num) || prefixSum < minPrefixSum.get(num)) {
24                minPrefixSum.put(num, prefixSum);
25            }
26
27             prefixSum += num;
28        }
29
30        return foundGoodSubarray ? maxGoodSum : 0;
31    }
32}