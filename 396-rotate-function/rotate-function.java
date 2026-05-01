class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
    
    int sum = 0;
    int f = 0;
    
    // 1. Calculate the total sum and the base case F(0)
    for (int i = 0; i < n; i++) {
        sum += nums[i];
        f += nums[i] * i;
    }
    
    int result = f;
    
    // 2. Use the mathematical relationship to find F(k) in O(1) time
    for (int k = 1; k < n; k++) {
        // Formula: F(k) = F(k-1) + sum - n * (element that moved to index 0)
        f = f + sum - n * nums[n - k];
        
        // Track the maximum value
        result = Math.max(result, f);
    }
    
    return result;
    }
}