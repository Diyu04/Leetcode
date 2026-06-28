class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        // 1,1,2,2,2     // 1, 100, 1000

        Arrays.sort(arr);
        int ans=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>=ans+1){
                ans++;
            }
        }
        return ans;

    }
}