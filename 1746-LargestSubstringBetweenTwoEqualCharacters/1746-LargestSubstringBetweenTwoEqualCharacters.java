// Last updated: 11/08/2026, 16:08:43
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLength = -1;
        
         for (char ch = 'a'; ch <= 'z'; ch++) {
            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);
        
            if (first != -1 && first != last) {
                int currentLength = last - first - 1;
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }
}