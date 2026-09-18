class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        find(result, 1, n, k, new ArrayList<>());

        return result;
    }

    private void find(List<List<Integer>> result, int start, int n, int k, List<Integer> tmpList) {
        if(tmpList.size() == k) {
            result.add(List.copyOf(tmpList));
            return;
        }
        for(int i = start; i <= n; i++) {
            tmpList.add(i);
            find(result, i+1, n, k, tmpList);
            tmpList.removeLast();
        }
    }
}