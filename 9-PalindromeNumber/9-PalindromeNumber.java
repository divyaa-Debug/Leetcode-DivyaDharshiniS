// Last updated: 11/08/2026, 16:15:54
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
       if(x<0)
       return false;
        int c=0;
        while(x!=0){
            int r=x%10;
             
            c=c*10+r;
            x/=10;
        }
      return c==temp;
       

    }
}