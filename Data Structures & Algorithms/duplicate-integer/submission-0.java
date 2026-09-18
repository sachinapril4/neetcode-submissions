class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean added = true;
        for(int num : nums) {
            added = set.add(num);
            if(!added) {
                return true;
            }
        }
        return false;
    }
}
