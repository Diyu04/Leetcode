class Solution {
    public int thirdMax(int[] nums) {
        // 3,2,1
        TreeSet<Integer> set = new TreeSet<>();
        for(int n:nums){
            set.add(n);
        }

        // 1,2,3
        if(set.size()<3){
            return set.last();
        }

         set.pollLast(); // remove largest
         set.pollLast(); // remove second largest

         return set.last(); // third largest


        
    }
}