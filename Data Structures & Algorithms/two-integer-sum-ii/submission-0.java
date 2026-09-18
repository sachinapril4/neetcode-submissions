class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> mapIndex = new HashMap<>();
        for(int i= 0; i < numbers.length; i++) {
            int rem = target - numbers[i];
            if(mapIndex.containsKey(rem)) {
                return new int[] {mapIndex.get(rem) + 1, i + 1};
            }
            mapIndex.put(numbers[i], i);
        }
        return null;
    }
}
