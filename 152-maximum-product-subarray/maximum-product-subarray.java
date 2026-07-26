class Solution {
    public int maxProduct(int[] nums) {
        // KADANE'S ALGORITHM   // PREFIX SUFFIX
        int prod=1;
        int max=Integer.MIN_VALUE;

        // left to right
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            max=Math.max(prod,max);
            if(prod==0) prod=1;
        }

        prod=1; // reinitialise the prod value

        // right to left
         for(int i=nums.length-1;i>=0;i--){
            prod*=nums[i];
            max=Math.max(prod,max);
            if(prod==0) prod=1;
        }

        return max;

    }
}