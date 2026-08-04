class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         List<Integer> res = new ArrayList<>(); 

         // [1,4,2,5]   res=[3]
         // sort-> [1,2,4,5]    
        Arrays.sort(nums);

        int currEle = nums[0];

        for(int i = 0 ; i < nums.length ; currEle++, i++){
            if(currEle < nums[i]){
                res.add(currEle);
                i--;
            }
        }

        return res;
    }
}