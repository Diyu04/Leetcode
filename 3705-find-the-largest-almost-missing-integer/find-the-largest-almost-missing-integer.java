class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int res=-1;
        for(int i=0;i<n;i++){
            // all elements
            if(k==n){
                res=Math.max(res,nums[i]);
            }
            // unique elements only
            else if(freq.get(nums[i])==1){
                if(k==1) res=Math.max(res,nums[i]);
                else if(i==0 || i==n-1) res=Math.max(nums[i],res); // boundary elements only matter
            }
        }
        return res;

    }
}