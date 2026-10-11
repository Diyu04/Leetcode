class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n= arr.length;
        int ans=0;

        for(int left=0;left<n;left++){
            int currSum=0;
            for(int right=left;right<n;right++){
                currSum+=arr[right];
                if((right-left+1)%2==1){
                    ans+=currSum;
                }
            }
        }
        return ans;
    }
}