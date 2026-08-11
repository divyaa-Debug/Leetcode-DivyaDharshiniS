// Last updated: 11/08/2026, 16:07:53
class Solution {
    public int maxArea(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dp = new int[m + 1][n + 1];

        for(int i = m - 1; i>=0; i--){
            for(int j = n - 1;j >=0; j--){
                if(mat[i][j] == 1){
                    dp[i][j] = 1 + Math.min(dp[i+1][j],Math.min(dp[i][j+1],dp[i+1][j+1]));
                }
            }
        }
        int low = 1;
        int high = Math.min(m,n);
        int ans = 0;

        while(low <= high) {
            int k =(low + high) / 2;
        
            int minR = m, maxR = -1;
            int minC = n, maxC = -1;

            for(int i=0;i<m;i++){
                for(int  j=0;j<n;j++){
                    if(dp[i][j] >= k){
                        minR = Math.min(minR, i);
                        maxR = Math.max(maxR, i);
                        minC = Math.min(minC, j);
                        maxC = Math.max(maxC, j);
                    }
                }
            }
            if (maxR - minR >= k || maxC - minC >=k){
                ans = k * k;
                low  = k + 1;
    }else {
        high = k - 1;
    }
        }   
        return ans;
            
        }
}