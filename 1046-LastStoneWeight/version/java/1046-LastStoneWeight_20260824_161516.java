// Last updated: 24/08/2026, 16:15:16
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
4        
5         for (int stone : stones) {
6            maxHeap.add(stone);
7        }
8        
9         while (maxHeap.size() > 1) {
10            int y = maxHeap.poll(); // Heaviest
11            int x = maxHeap.poll(); // Second heaviest
12            
13            if (y != x) {
14                maxHeap.add(y - x);
15            }
16        }
17        
18         return maxHeap.isEmpty() ? 0 : maxHeap.poll();
19    }
20}