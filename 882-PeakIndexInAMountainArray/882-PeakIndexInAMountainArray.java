// Last updated: 11/08/2026, 16:10:04
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=arr[0];
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
            max=arr[i];
            a=i;
            }
        }
        return a;
    }
}