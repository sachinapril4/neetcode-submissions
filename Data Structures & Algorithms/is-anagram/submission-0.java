class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            int count = map.getOrDefault(sArr[i], 0) + 1;
            if(count == 0) {
                map.remove(sArr[i]);
            } else {
                map.put(sArr[i], count);
            }
            count = map.getOrDefault(tArr[i], 0) - 1;
            if(count == 0) {
                map.remove(tArr[i]);
            } else {
                map.put(tArr[i], count);
            }
        }
        return map.isEmpty();
    }
}
