class Solution {
    public boolean isTrionic(int[] nums) {
        // Linear Scan
        // TC: O(N)
        
        int n = nums.length;
        if (n < 4)
            return false; // not possible

        int i = 0;
        while (i + 1 < n && nums[i] < nums[i + 1]) {       // Climb Up
            i++;                                            //finding PEAK
        }
        if (i == 0 || i == n - 1)
            return false;

        int p = i; // peak
        while (i + 1 < n && nums[i] > nums[i + 1]) {        // Climb Down
            i++;                                             //finding VALLEY
        }

        if (i == p || i == n - 1)
            return false;

        int q = i; // valley

        while (i + 1 < n && nums[i] < nums[i + 1]) {      // Climb Up Again
            i++;
        }

        return i == n - 1;

    }
}