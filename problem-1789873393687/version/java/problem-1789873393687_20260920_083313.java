// Last updated: 20/09/2026, 08:33:13
1class Solution {
2    public long countIntersectingIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
4        long c=0;
5        for(int i=0;i<intervals.length;i++){
6            int l=i+1,r=intervals.length-1,mi=i;
7            while(l<=r){
8                int mid=l+(r-l)/2;
9                if(intervals[mid][0]<=intervals[i][1]){
10                    mi=mid;
11                    l=mid+1;
12                }else{
13                    r=mid-1;
14                }
15            }
16            c+=(mi-i);
17        }
18        return c;
19    }
20}