// Last updated: 11/08/2026, 16:08:44
class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] shuffled = new char[n];
        
        for (int i = 0; i < n; i++) {
            shuffled[indices[i]] = s.charAt(i);
        }
        
        return new String(shuffled);
    }
}