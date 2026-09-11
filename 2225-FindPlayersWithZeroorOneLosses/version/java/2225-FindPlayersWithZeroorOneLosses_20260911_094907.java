// Last updated: 11/09/2026, 09:49:07
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        Map<Integer, Integer> lossCount = new HashMap<>();
4
5        for (int[] match : matches) {
6            int winner = match[0];
7            int loser = match[1];
8
9            // Ensure the winner is in the map with at least 0 losses
10            lossCount.putIfAbsent(winner, 0);
11
12            // Increment the loser's loss count
13            lossCount.put(loser, lossCount.getOrDefault(loser, 0) + 1);
14        }
15
16        List<Integer> zeroLoss = new ArrayList<>();
17        List<Integer> oneLoss = new ArrayList<>();
18
19        for (Map.Entry<Integer, Integer> entry : lossCount.entrySet()) {
20            int player = entry.getKey();
21            int losses = entry.getValue();
22
23            if (losses == 0) {
24                zeroLoss.add(player);
25            } else if (losses == 1) {
26                oneLoss.add(player);
27            }
28        }
29
30        Collections.sort(zeroLoss);
31        Collections.sort(oneLoss);
32
33        return Arrays.asList(zeroLoss, oneLoss);
34    }
35}