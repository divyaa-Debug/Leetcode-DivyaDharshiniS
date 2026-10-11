// Last updated: 11/10/2026, 08:35:40
1class Solution {
2    public List<Integer> maxPrimes(int n, int s) {
3        List<Integer> res=new ArrayList<>();
4        boolean[] isprime=new boolean[n+1];
5        Arrays.fill(isprime, true);
6        long sum=0;
7
8        for(int p=2;p<=n;p++){
9            if(isprime[p]){
10                for(long i=(long)p*p;i<=n;i+=p) isprime[(int)i]=false;
11                if(sum+p<=s){
12                    res.add(p);
13                    sum+=p;
14                }
15                else{
16                    break;
17                }
18            }
19        }
20        return res;
21    }
22}