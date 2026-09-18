class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int sum = 0;
        threshold *= k;
        int result = 0;
        for(int i =0 ; i < k - 1; i++) {
            sum += arr[i];
        }
    
        for(int j = k - 1; j < arr.length; j++) {
            sum += arr[j];
            if(sum >= threshold) {
                result++;
            }
            sum -= arr[l++];
        }
        return result;
    }
}