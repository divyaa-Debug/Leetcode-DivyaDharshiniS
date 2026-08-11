// Last updated: 11/08/2026, 16:07:20
class Solution {
    public long maxPairStrength(int[] nums) {
        long ms=0;
        int n=nums.length; 

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n ;j++){
                long a = nums[i];
                long b = nums[j];
                long g = gcd(a,b);

                long cs =(a*b) / (g*g);
                ms = Math.max(ms,cs);
            }
        }
        return ms;
    }
    private long gcd(long a,long b) {
        while(b!=0){
            long temp = b;
            b = a % b;
            a =temp;
        }
        return a;
    }
}