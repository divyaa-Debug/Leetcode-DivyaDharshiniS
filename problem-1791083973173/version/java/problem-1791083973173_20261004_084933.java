// Last updated: 04/10/2026, 08:49:33
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3       long MIN=Long.MIN_VALUE/2;
4        long s0=MIN;
5        long s1=MIN;
6        long s2=MIN;
7        long s3=MIN;
8        long maxsum=MIN;
9
10        for(int x:nums){
11            long next_s0=s1!=MIN ? s1-x:MIN;
12            long next_s1=Math.max((long)x,s0!=MIN?s0+x:MIN);
13            
14            long next_s2=s3!=MIN?s3-x:MIN;
15            if(s0!=MIN) next_s2=Math.max(next_s2,s0);
16            long next_s3=s2!=MIN?s2+x:MIN;
17            if(s1!=MIN) next_s3=Math.max(next_s3,s1);
18
19            s0=next_s0;
20            s1=next_s1;
21            s2=next_s2;
22            s3=next_s3;
23
24            maxsum=Math.max(maxsum,Math.max(Math.max(s0,s1),Math.max(s2,s3)));
25        }
26        return maxsum;
27    }
28}