// Last updated: 11/08/2026, 16:08:01
class Solution {
    public int countKeyChanges(String s) {
         String lowerStr = s.toLowerCase();
        int changes = 0;
        
         for (int i = 1; i < lowerStr.length(); i++) {
            if (lowerStr.charAt(i) != lowerStr.charAt(i - 1)) {
                changes++;
            }
        }
        
        return changes;
    }
}