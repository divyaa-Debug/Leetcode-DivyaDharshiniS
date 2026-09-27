// Last updated: 27/09/2026, 08:54:32
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int n=nums.length;
4        int bp=0;
5
6        Map<Long,Integer> pairCounts=new HashMap<>();
7
8        for(int i=0;i<n-1;i++){
9            if(nums[i]==nums[i+1]){
10                bp++;
11            }
12            else{
13 int lo=Math.min(nums[i],nums[i+1]),hi=Math.max(nums[i],nums[i+1]);
14                long key=((long)lo<<32)|(hi&0xffffffffL);
15                pairCounts.merge(key,1,Integer::sum);
16            }
17        }
18        int mg=0;
19        for(int c:pairCounts.values()){
20            mg=Math.max(mg,c);
21        }
22        return bp+mg;
23    }
24}