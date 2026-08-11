// Last updated: 11/08/2026, 16:11:27
class Solution {
    public boolean detectCapitalUse(String word) {
        String wd = word; 
        
        if (word.toUpperCase().equals(wd)) return true; 
        
        if (word.toLowerCase().equals(wd)) return true;
        
        String tail = word.substring(1);
        if (Character.isUpperCase(word.charAt(0)) && tail.toLowerCase().equals(tail)) return true;
        
        return false; 
    }
}