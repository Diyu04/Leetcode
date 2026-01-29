class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res=new int[2];
        int k=0;
        Map<Integer,Integer> count = new HashMap<>();
        for(int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);
            if(count.get(n)==2){
                res[k++]=n;
            }
        } 
        return res;
    }
}