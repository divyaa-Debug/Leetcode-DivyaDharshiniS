// Last updated: 11/08/2026, 16:11:30
 
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n]; 
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[]{score[i], i};
        }
         
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]); 
        for (int i = 0; i < n; i++) {
            int originalIndex = pairs[i][1];
            if (i == 0) ans[originalIndex] = "Gold Medal";
            else if (i == 1) ans[originalIndex] = "Silver Medal";
            else if (i == 2) ans[originalIndex] = "Bronze Medal";
            else ans[originalIndex] = String.valueOf(i + 1);
        }
        
        return ans;
    }
}
