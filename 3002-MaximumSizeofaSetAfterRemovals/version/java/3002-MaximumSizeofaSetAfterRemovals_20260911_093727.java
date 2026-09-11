// Last updated: 11/09/2026, 09:37:27
1class Solution {
2    public int maximumSetSize(int[] nums1, int[] nums2) {
3     int n = nums1.length;
4        int maxSelect = n / 2;
5
6        Set<Integer> set1 = new HashSet<>();
7        Set<Integer> set2 = new HashSet<>();
8
9        for (int num : nums1) set1.add(num);
10        for (int num : nums2) set2.add(num);
11
12         int only1 = 0;
13        int only2 = 0;
14        int common = 0;
15
16        for (int num : set1) {
17            if (set2.contains(num)) {
18                common++;
19            } else {
20                only1++;
21            }
22        }
23
24        for (int num : set2) {
25            if (!set1.contains(num)) {
26                only2++;
27            }
28        }
29
30         int take1 = Math.min(only1, maxSelect);
31        int take2 = Math.min(only2, maxSelect);
32
33         int remCap = (maxSelect - take1) + (maxSelect - take2);
34        int takeCommon = Math.min(common, remCap);
35
36        return take1 + take2 + takeCommon;
37    }
38}