// Last updated: 30/08/2026, 09:07:03
1class Solution {
2    public int sumDecoded(long[] nums) {
3        long MOD=1000000007L;
4        long ts=0;
5
6        for(long num:nums){
7            int w=(int)(num%10);
8            long d=num/10;
9            String s=String.valueOf(d);
10            String xstr=s.substring(0,w);
11            String ystr=s.substring(w);
12
13            long x=Long.parseLong(xstr);
14            long y=Long.parseLong(ystr);
15
16            long dv=power(x,y,MOD);
17            ts=(ts+dv)%MOD;
18        }
19        return (int) ts;
20    }
21    private long power(long base,long exp,long mod){
22    long res=1;
23    base=base%mod;
24    while(exp>0){
25    if((exp&1)==1){
26        res=(res*base)%mod;
27    }
28        base=(base*base)%mod;
29        exp>>=1;
30    }
31        return res;
32    }
33}