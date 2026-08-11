// Last updated: 11/08/2026, 16:08:35
class Solution {
    public boolean checkIfPangram(String sentence) {
    
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;  
            }
        }
        return true;
    }
}