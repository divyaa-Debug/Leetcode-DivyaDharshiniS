// Last updated: 11/08/2026, 16:08:12
class Solution {
    public int maxFrequencyElements(int[] nums) {
       
        int[] count = new int[101];
        int maxFreq = 0;
        int ans = 0;

        for (int num : nums) {
            count[num]++;  
            
            if (count[num] > maxFreq) {
                maxFreq = count[num];  
                ans = maxFreq;        
            } 
            else if (count[num] == maxFreq) {
                ans += maxFreq;        
            }
        }

        return ans;
    }
}
 