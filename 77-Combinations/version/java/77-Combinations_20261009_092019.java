// Last updated: 09/10/2026, 09:20:19
1 
2class Solution {
3    public List<List<Integer>> combine(int n, int k) {
4        List<List<Integer>> result = new ArrayList<>();
5        backtrack(1, n, k, new ArrayList<>(), result);
6        return result;
7    }
8
9    private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
10        // Base case: if the current combination reaches size k, store a copy of it
11        if (current.size() == k) {
12            result.add(new ArrayList<>(current));
13            return;
14        }
15
16        // Optimization (Pruning):
17        // We need (k - current.size()) more elements.
18        // So start can go at most up to: n - (k - current.size()) + 1
19        int maxStart = n - (k - current.size()) + 1;
20
21        for (int i = start; i <= maxStart; i++) {
22            current.add(i);                       // Choose element
23            backtrack(i + 1, n, k, current, result); // Recurse for remaining elements
24            current.remove(current.size() - 1);  // Backtrack
25        }
26    }
27}