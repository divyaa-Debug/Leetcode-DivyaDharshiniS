// Last updated: 11/08/2026, 16:07:56
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
         int[] colMax = new int[n];
        
         for (int j = 0; j < n; j++) {
            int maxVal = -1;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > maxVal) {
                    maxVal = matrix[i][j];
                }
            }
            colMax[j] = maxVal;
        }
        
         int[][] answer = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    answer[i][j] = colMax[j];
                } else {
                    answer[i][j] = matrix[i][j];
                }
            }
        }
        
        return answer;
    }
}