// Last updated: 11/09/2026, 09:55:18
1 
2class Solution {
3    public List<Integer> spiralOrder(int[][] matrix) {
4        List<Integer> result = new ArrayList<>();
5        if (matrix == null || matrix.length == 0) return result;
6
7        int top = 0;
8        int bottom = matrix.length - 1;
9        int left = 0;
10        int right = matrix[0].length - 1;
11
12        while (left <= right && top <= bottom) {
13            // Traverse from left to right across top row
14            for (int col = left; col <= right; col++) {
15                result.add(matrix[top][col]);
16            }
17            top++;
18
19            // Traverse down right column
20            for (int row = top; row <= bottom; row++) {
21                result.add(matrix[row][right]);
22            }
23            right--;
24
25            // Traverse from right to left across bottom row
26            if (top <= bottom) {
27                for (int col = right; col >= left; col--) {
28                    result.add(matrix[bottom][col]);
29                }
30                bottom--;
31            }
32
33            // Traverse up left column
34            if (left <= right) {
35                for (int row = bottom; row >= top; row--) {
36                    result.add(matrix[row][left]);
37                }
38                left++;
39            }
40        }
41
42        return result;
43    }
44}