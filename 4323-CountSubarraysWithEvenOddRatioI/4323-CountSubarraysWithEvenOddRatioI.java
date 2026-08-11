// Last updated: 11/08/2026, 16:07:51
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
       int n=nums.length;
        int ans=0;

        for(int i=0;i<n;i++){
            int e=0;
            int o=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0)
                    e++;
                else
                    o++;

                if(o>0 && e*b <= o*a)
                    ans++;
            }
        }
        return ans;
    }
}