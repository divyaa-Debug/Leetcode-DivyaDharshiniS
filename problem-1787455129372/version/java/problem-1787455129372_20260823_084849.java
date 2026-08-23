// Last updated: 23/08/2026, 08:48:49
1class Solution {
2    public boolean isPalindromic(String s) {
3        String b=s.chars()
4            .mapToObj(c->String.format("%08d",Integer.parseInt(Integer.toBinaryString(c)))).reduce("",String::concat);
5
6        return b.equals(new StringBuilder(b).reverse().toString());
7    }
8}