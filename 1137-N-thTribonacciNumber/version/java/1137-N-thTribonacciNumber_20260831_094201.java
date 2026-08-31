// Last updated: 31/08/2026, 09:42:01
1class Solution {
2    public int tribonacci(int n) {
3        if (n == 0) return 0;
4        if (n == 1 || n == 2) return 1;
5
6        int t0 = 0;
7        int t1 = 1;
8        int t2 = 1;
9
10        for (int i = 3; i <= n; i++) {
11            int tNext = t0 + t1 + t2;
12            t0 = t1;
13            t1 = t2;
14            t2 = tNext;
15        }
16
17        return t2;
18    }
19}