class Solution {
    public int[] getConcatenation(int[] nums) {
         int[] a = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
            a[(a.length-1)-i]=nums[(nums.length-1)-i];
        }
        return a;
    }
}