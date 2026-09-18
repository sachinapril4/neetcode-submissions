class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        int[] arr;
        for(String str : strs) {
            arr = new int[26];
            for(char ch : str.toCharArray()) {
                arr[ch - 'a']++;
            }
            String charStr = Arrays.toString(arr);
            groups.putIfAbsent(charStr, new ArrayList<>());
            groups.get(charStr).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}
