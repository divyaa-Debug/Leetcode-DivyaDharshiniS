// Last updated: 11/08/2026, 16:08:23
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        
         for (String w : words1) {
            map.put(w, Math.min(map.getOrDefault(w, 0) + 1, 2));
        }
        
         for (String w : words2) {
            if (map.containsKey(w) && map.get(w) <= 1) {
                map.put(w, map.get(w) - 1);
            }
        }
        
         int count = 0;
        for (int v : map.values()) {
            if (v == 0) count++;
        }
        
        return count;
    }
}