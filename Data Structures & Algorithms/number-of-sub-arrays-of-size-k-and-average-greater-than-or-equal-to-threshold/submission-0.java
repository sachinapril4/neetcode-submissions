class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int sum = 0;
        int result = 0;
        for(int i =0 ; i < k; i++) {
            sum += arr[i];
        }
        if(sum/k >= threshold) {
            result++;
        }
        for(int j = k; j < arr.length; j++) {
            sum -= arr[l++];
            sum += arr[j];
            if(sum/k >= threshold) {
                result++;
            }
        }
        return result;
    }
}