// Last updated: 24/08/2026, 16:13:14
1class KthLargest {
2    private PriorityQueue<Integer> minHeap;
3    private int k;
4
5    public KthLargest(int k, int[] nums) {
6        this.k = k;
7        this.minHeap = new PriorityQueue<>();
8        
9         for (int num : nums) {
10            add(num);
11        }
12    }
13    
14    public int add(int val) {
15        // Add the new value to the heap
16        minHeap.offer(val);
17        
18         if (minHeap.size() > k) {
19            minHeap.poll();
20        }
21          return minHeap.peek();
22    }
23}
24
25/**
26 * Your KthLargest object will be instantiated and called as such:
27 * KthLargest obj = new KthLargest(k, nums);
28 * int param_1 = obj.add(val);
29 */