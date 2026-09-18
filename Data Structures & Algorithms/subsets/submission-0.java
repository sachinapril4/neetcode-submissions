class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findSubSet(result, 0, nums, new ArrayList<Integer>());
        return result;
    }
    void findSubSet(List<List<Integer>> result, int start, int[] nums, List<Integer> tmpList) {
        result.add(List.copyOf(tmpList));
        
        for(int i = start; i < nums.length; i++) {
            tmpList.add(nums[i]);
            findSubSet(result, i + 1, nums, tmpList);
            tmpList.removeLast();
        }
    }

}
