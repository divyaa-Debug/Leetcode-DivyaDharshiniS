// Last updated: 11/08/2026, 16:08:50
 
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
             seen.add(num);
        }
        
        return false;
    }
}