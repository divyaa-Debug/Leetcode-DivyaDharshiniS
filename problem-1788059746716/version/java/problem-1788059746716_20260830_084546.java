// Last updated: 30/08/2026, 08:45:46
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Set<Integer> s=new HashSet<>();
4        Set<Integer> in=new HashSet<>();
5        for(int i=0;i<nums.length;i++){
6            if(i==0||nums[i]!=nums[i-1]){
7                if(s.contains(nums[i])){
8                    in.add(nums[i]);
9                }else{
10                    s.add(nums[i]);
11                }
12            }
13        }
14        return s.size()-in.size();
15    }
16}