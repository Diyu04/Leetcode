class Solution {
    public int findNonMinOrMax(int[] nums) {
        // TC:  O(NlogN)
        
        if(nums.length<3) return -1;
        Arrays.sort(nums);  // 1 2 3 4
        return nums[1];

    }
}