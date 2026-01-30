class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) even++;
            if(even==2) return true;
        }
        return false;
    }
}