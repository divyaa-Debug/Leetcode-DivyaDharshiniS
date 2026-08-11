// Last updated: 11/08/2026, 16:15:57
class Solution {
    public int reverse(int x) {
int c=0;
     while (x != 0) { 
            int r = x % 10;
           
            if (c > Integer.MAX_VALUE / 10 || c < Integer.MIN_VALUE / 10) {
                return 0;
            }
c=c*10+r;
x/=10;
        }
    
        return c;
    }
}