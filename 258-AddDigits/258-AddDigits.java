// Last updated: 11/08/2026, 16:12:26
class Solution {
    public int addDigits(int num) {
       
        while(num>9){
            int t=0;
            while(num>0){
                int d=0;
            d=num%10;
            t+=d;
            num/=10;
            }
            num=t;
        }
        return num;
    }
}