// Last updated: 24/09/2026, 10:21:32
1class RandomizedSet {
2    private List<Integer> list;
3    private Map<Integer, Integer> map;
4    private Random rand;
5
6    public RandomizedSet() {
7        list = new ArrayList<>();
8        map = new HashMap<>();
9        rand = new Random();
10    }
11    
12    public boolean insert(int val) {
13        if (map.containsKey(val)) {
14            return false;
15        }
16        map.put(val, list.size());
17        list.add(val);
18        return true;
19    }
20    
21    public boolean remove(int val) {
22        if (!map.containsKey(val)) {
23            return false;
24        }
25        
26        int index = map.get(val);
27        int lastElement = list.get(list.size() - 1);
28        
29         list.set(index, lastElement);
30        map.put(lastElement, index);
31        
32         list.remove(list.size() - 1);
33        map.remove(val);
34        
35        return true;
36    }
37    
38    public int getRandom() {
39        return list.get(rand.nextInt(list.size()));
40    }
41}
42
43/**
44 * Your RandomizedSet object will be instantiated and called as such:
45 * RandomizedSet obj = new RandomizedSet();
46 * boolean param_1 = obj.insert(val);
47 * boolean param_2 = obj.remove(val);
48 * int param_3 = obj.getRandom();
49 */