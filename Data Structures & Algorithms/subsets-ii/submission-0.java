class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(result, nums, 0, new ArrayList<Integer>());
        return result;
    }

    private void findSubsets(List<List<Integer>> result, int[] nums, int index, List<Integer> tmpList) {
        result.add(new ArrayList<>(tmpList));
        
        for(int i = index; i < nums.length; i++) {
            if(i != index && nums[i] == nums[i - 1]) {
                continue;
            }
            tmpList.add(nums[i]);
            findSubsets(result, nums, i + 1, tmpList);
            tmpList.removeLast();
        }
    }
}
