// Last updated: 11/08/2026, 16:08:15
import java.util.HashSet;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> seen = new HashSet<>();
        int pairsCount = 0;
        
        for (String word : words) {
             String reversed = "" + word.charAt(1) + word.charAt(0);
            
            if (seen.contains(reversed)) {
                pairsCount++;
                 seen.remove(reversed); 
            } else {
                seen.add(word);
            }
        }
        
        return pairsCount;
    }
}