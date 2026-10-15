class Solution {
    public int sumCounts(List<Integer> nums) {
        //  1 , 2  , 1   // i=0,j=0,1,2  
        // set=1,2,1    // i=1, j=1   set=2,1  // i=2,j=2  set=1;    
        // res=1*1+2*2+2*2+1*1+2*2+1*1 => 15
        int n =  nums.size();
        int res = 0;
        int count=0;

        for(int i=0;i<n;i++){
            Set<Integer> s = new HashSet<>();
            for(int j=i;j<n;j++){
                s.add(nums.get(j));
                res+=s.size()*s.size();
                count++;
            }
        }
        System.out.println(count);
        return res;
    }
}