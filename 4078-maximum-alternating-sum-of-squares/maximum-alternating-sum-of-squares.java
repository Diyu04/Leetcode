class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

     // squaring the integers in the array
        for(int i=0;i<n;i++){              //  O(N)
            nums[i]*=nums[i];
        }
        // sort the squared array
        Arrays.sort(nums);             // O(NLOGN)

        long ans = 0;

        // minus half of the array
        for(int i=0;i<n/2;i++){           // O(N/2)
            ans-=nums[i];
        }
        // add the other greater half
        for(int i=n/2;i<n;i++){           //O(N/2)
            ans+=nums[i];
        }

        return ans;
    }
}