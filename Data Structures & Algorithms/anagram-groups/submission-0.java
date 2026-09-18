class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for(String s : strs) {
            int[] sArr = new int[26];
            for(char ch : s.toCharArray()) {
                sArr[ch - 'a']++;
            }
            String str = Arrays.toString(sArr);
            groups.putIfAbsent(str, new ArrayList<>());
            groups.get(str).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}
