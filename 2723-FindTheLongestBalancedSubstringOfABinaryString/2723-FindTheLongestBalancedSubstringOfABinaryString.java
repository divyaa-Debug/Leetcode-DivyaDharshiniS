// Last updated: 11/08/2026, 16:08:16
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int maxLen = 0;
        int i = 0;
        int n = s.length();
        
        while (i < n) {
            int zeros = 0;
            int ones = 0;
            
            // 1. Count consecutive zeros
            while (i < n && s.charAt(i) == '0') {
                zeros++;
                i++;
            }
            
             while (i < n && s.charAt(i) == '1') {
                ones++;
                i++;
            }
            
             int currentBalancedLen = 2 * Math.min(zeros, ones);
            maxLen = Math.max(maxLen, currentBalancedLen);
        }
        
        return maxLen;
    }
}