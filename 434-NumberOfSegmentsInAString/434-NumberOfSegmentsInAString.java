// Last updated: 11/08/2026, 16:11:42
class Solution {
    public int countSegments(String s) {
         String trimmed = s.trim();
        
         if (trimmed.equals("")) {
            return 0;
        }
        
         return trimmed.split(" +").length;
    }
}