class Solution {
    public int findNonMinOrMax(int[] nums) {
        // TC:  O(1)
        // 3 1 2 4
        if(nums.length<3) return -1;
        if((nums[0]>nums[1] && nums[0]<nums[2])||(nums[0]>nums[2] && nums[0]<nums[1])){
            return nums[0];
             }  // since nums[0] can't be max or min now
         if((nums[1]>nums[0] && nums[1]<nums[2])||(nums[1]>nums[2] && nums[1]<nums[0])){
            return nums[1];
             }  // since nums[1] can't be max or min now

             return nums[2];


    }
}