// Last updated: 11/08/2026, 16:10:28
 

class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String> set = new HashSet<>();
        set.add(""); 
        String ans = "";

        for (String w : words) {
            
            if (set.contains(w.substring(0, w.length() - 1))) {
                set.add(w);
                if (w.length() > ans.length()) {
                    ans = w;
                }
            }
        }
        return ans;
    }
}
