// Last updated: 11/08/2026, 16:10:12
class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length()!=goal.length()){
        return false;
        }
String doubled = s + s;
        return doubled.contains(goal);
    }
}