// Last updated: 11/09/2026, 09:53:41
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4        
5        int top = 0;
6        int bottom = n - 1;
7        int left = 0;
8        int right = n - 1;
9        
10        int val = 1;
11        
12        while (left <= right && top <= bottom) {
13             for (int col = left; col <= right; col++) {
14                matrix[top][col] = val++;
15            }
16            top++;
17            
18             for (int row = top; row <= bottom; row++) {
19                matrix[row][right] = val++;
20            }
21            right--;
22            
23             if (top <= bottom) {
24                for (int col = right; col >= left; col--) {
25                    matrix[bottom][col] = val++;
26                }
27                bottom--;
28            }
29            
30             if (left <= right) {
31                for (int row = bottom; row >= top; row--) {
32                    matrix[row][left] = val++;
33                }
34                left++;
35            }
36        }
37        
38        return matrix;
39    }
40}