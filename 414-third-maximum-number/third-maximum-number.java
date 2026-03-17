class Solution {
    public int thirdMax(int[] nums) {
        // 3,2,1
        Set<Integer> set = new TreeSet<>();
        for(int n:nums){
            set.add(n);
        }

        int[] distinctArray=new int[set.size()];
        int i = 0;

        for (int num : set) {
            distinctArray[i++] = num;
        }
        // 1,2,3
        if(set.size()<3) return distinctArray[set.size()-1];
        if(set.size()==3)  return distinctArray[0];

        return distinctArray[set.size()-3];


        
    }
}