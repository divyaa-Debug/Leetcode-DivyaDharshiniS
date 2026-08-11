// Last updated: 11/08/2026, 16:08:09
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag = 0;
        int maxArea = 0;

        for (int[] rect : dimensions) {
            int len = rect[0];
            int wid = rect[1];
            
            int currentDiag = len * len + wid * wid;
            int currentArea = len * wid;

            if (currentDiag > maxDiag) {
                maxDiag = currentDiag;
                maxArea = currentArea;
            } else if (currentDiag == maxDiag) {
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }

        return maxArea;
    }
}