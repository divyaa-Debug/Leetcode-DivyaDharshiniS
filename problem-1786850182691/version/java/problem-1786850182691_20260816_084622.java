// Last updated: 16/08/2026, 08:46:22
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int maxLight=0;
4        for(int light:lights){
5         maxLight=Math.max(maxLight,light);
6        }
7    int maxPenalty=0;
8    for(int t:arrivalTime){
9    int r=t%period;
10    int currentWait=0;
11    
12if(r>=maxLight){
13    currentWait=period-r;
14}
15maxPenalty=Math.max(maxPenalty,currentWait);
16    }
17        return maxPenalty;
18}
19}