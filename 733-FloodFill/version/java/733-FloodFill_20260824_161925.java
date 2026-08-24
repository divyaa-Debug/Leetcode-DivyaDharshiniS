// Last updated: 24/08/2026, 16:19:25
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int originalColor = image[sr][sc];
4        
5         if (originalColor != color) {
6            dfs(image, sr, sc, originalColor, color);
7        }
8        
9        return image;
10    }
11
12    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
13         if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) {
14            return;
15        }
16        if (image[r][c] != originalColor) {
17            return;
18        }
19
20         image[r][c] = newColor;
21
22         dfs(image, r + 1, c, originalColor, newColor);
23        dfs(image, r - 1, c, originalColor, newColor);
24        dfs(image, r, c + 1, originalColor, newColor);
25        dfs(image, r, c - 1, originalColor, newColor);
26    }
27}