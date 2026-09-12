// Last updated: 12/09/2026, 10:24:36
1 
2class Solution {
3    public int minSteps(String s, String t) {
4        int[] count = new int[26];
5        
6        for (int i = 0; i < s.length(); i++) {
7            count[s.charAt(i) - 'a']++;
8            count[t.charAt(i) - 'a']--;
9        }
10        
11        int steps = 0;
12        for (int c : count) {
13            if (c > 0) {
14                steps += c;
15            }
16        }
17        
18        return steps;
19    }
20}