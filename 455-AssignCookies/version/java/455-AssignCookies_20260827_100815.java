// Last updated: 27/08/2026, 10:08:15
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        
6        int i = 0; 
7        int j = 0;  
8        
9         while (i < g.length && j < s.length) {
10            if (s[j] >= g[i]) {
11                i++;  
12            }
13            j++;  
14        }
15        
16        return i;
17    }
18}