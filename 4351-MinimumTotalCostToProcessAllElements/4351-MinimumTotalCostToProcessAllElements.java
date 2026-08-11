// Last updated: 11/08/2026, 16:07:35
class Solution {
    public int minimumCost(int[] nums, int k) {
        long r=k;
        long t=0;
        long mod=1_000_000_007;

        for(int i=0;i<nums.length;i++){

            while(r<nums[i]){
                long d=nums[i]-r;
               // r+=k;
               // t++;
                long on=(d+k-1)/k;
                t+=on;
                r+=on*k;
            }
            r-=nums[i];
        }
        //long tc=0;
        //for(int i=1;i<=t;i++){
          //  tc=(tc+i) % mod;
        //}
        //return (int) tc;
        long a=t;
        long b=t+1;
        if(a%2==0){
            a/=2;
        }
        else{
            b/=2;
        }
        long tc=((a%mod)*(b%mod))%mod;
        return (int) tc;
    }
}