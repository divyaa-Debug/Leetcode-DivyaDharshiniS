// Last updated: 11/08/2026, 16:10:22
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char i:letters){
            if(i>target)
            return i;
        }
        return letters[0];
    }
}