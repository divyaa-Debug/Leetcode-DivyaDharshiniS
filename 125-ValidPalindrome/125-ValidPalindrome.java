// Last updated: 11/08/2026, 16:14:19
class Solution {
    public boolean isPalindrome(String s) {
         if (s == null) {
            return true;
        }
        
        StringBuilder i = new StringBuilder();
        
         for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                i.append(Character.toLowerCase(c));
            }
        }
        
         String original = i.toString();
        String reversed = i.reverse().toString();
        
         return original.equals(reversed);
    }
}