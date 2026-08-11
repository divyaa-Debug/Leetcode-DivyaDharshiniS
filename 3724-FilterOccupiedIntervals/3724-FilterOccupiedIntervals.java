// Last updated: 11/08/2026, 16:07:54
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        List<List<Integer>> result =new ArrayList<>();  
        if(occupiedIntervals.length==0)
           return result;
        Arrays.sort(occupiedIntervals,(a,b)->a[0]-b[0]);
        List<int[]> merged = new ArrayList<>();
        int[] current = occupiedIntervals[0];
        for(int[] next : occupiedIntervals){
            if(next[0]<=current[1]+1)
                current[1]=Math.max(current[1],next[1]);
            else{
                merged.add(current);
                current=next;
            }
        }
        merged.add(current);
        for(int[] interval : merged){
            int start = interval[0];
            int end = interval[1];
            if(end<freeStart || start>freeEnd)
                result.add(Arrays.asList(start,end));
            else{
                if(start<freeStart)
                    result.add(Arrays.asList(start,freeStart-1));
                if(end>freeEnd)
                    result.add(Arrays.asList(freeEnd+1,end));
            }
        }
           return result;
    }
}