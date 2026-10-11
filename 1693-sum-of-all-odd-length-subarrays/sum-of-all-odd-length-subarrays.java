class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n= arr.length;
        int ans=0;

        for(int left=0;left<n;left++){
            for(int right=left;right<n;right++){
                if((right-left+1)%2==1){
                    int currSum=0;
                    for(int i=left;i<right+1;i++){
                        currSum+=arr[i];
                    }
                    ans+=currSum;
                }
            }
        }
        return ans;
    }
}