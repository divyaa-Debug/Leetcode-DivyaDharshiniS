// Last updated: 23/08/2026, 09:05:30
1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
3        List<List<Integer>> res=new ArrayList<>();
4        Arrays.sort(nums);
5        long curr=lower;
6        for(int n:nums){
7            if(n<curr)
8                continue;
9            if(n>upper)
10                break;
11            if(n>curr)
12                  res.add(Arrays.asList((int)curr,n-1));
13            curr=(long)n+1;
14        }
15        if(curr<=upper)
16                res.add(Arrays.asList((int)curr,upper));
17            
18        return res;
19    }
20}