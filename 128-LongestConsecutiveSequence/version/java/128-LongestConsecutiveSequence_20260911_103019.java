// Last updated: 11/09/2026, 10:30:19
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        
4        if (nums == null || nums.length == 0) {
5            return 0;
6        }
7
8        Set<Integer> numSet = new HashSet<>();
9        for (int num : nums) {
10            numSet.add(num);
11        }
12
13        int longestStreak = 0;
14
15        for (int num : numSet) {
16             if (!numSet.contains(num - 1)) {
17                int currentNum = num;
18                int currentStreak = 1;
19
20                while (numSet.contains(currentNum + 1)) {
21                    currentNum += 1;
22                    currentStreak += 1;
23                }
24
25                longestStreak = Math.max(longestStreak, currentStreak);
26            }
27        }
28
29        return longestStreak;
30    }
31}