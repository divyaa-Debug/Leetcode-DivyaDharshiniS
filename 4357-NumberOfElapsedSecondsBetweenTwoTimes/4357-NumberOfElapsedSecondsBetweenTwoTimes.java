// Last updated: 11/08/2026, 16:07:14
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return getSeconds(endTime)-getSeconds(startTime);
    }
    private int getSeconds(String timeStr){
        String[] parts=timeStr.split(":");
           int h= Integer.parseInt(parts[0]);    
     int m= Integer.parseInt(parts[1]);
         int s= Integer.parseInt(parts[2]);

        return (h*3600)+(m*60)+s;
    }
}