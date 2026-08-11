// Last updated: 11/08/2026, 16:12:56
  
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
             if (seen.contains(num)) {
                return true;
            }
             seen.add(num);
        }
        
         return false;
    }
}
    