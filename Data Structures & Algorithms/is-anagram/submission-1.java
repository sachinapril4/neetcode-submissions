class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()) {
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < s.length(); i++) {
                map.compute(s.charAt(i), (key, val) 
                  -> (val == null) ? 1 : val + 1);
                map.compute(t.charAt(i), (key, val) 
                  -> (val == null) ? -1 : val - 1);
            }

            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry.getValue() != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
