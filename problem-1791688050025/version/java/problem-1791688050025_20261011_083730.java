// Last updated: 11/10/2026, 08:37:30
1class Solution {
2    public boolean threeFibonacciSum(int n) {
3        long a=0;
4        long b=1;
5        long c=1;
6
7        while(true){
8            long currentSum=a+b+c;
9
10            if(currentSum==n){
11                return true; 
12            }
13            if(currentSum>n)
14            return false;
15
16            a=b;
17            b=c;
18            c=a+b;
19        }
20    }
21}