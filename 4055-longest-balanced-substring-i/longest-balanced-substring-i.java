class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int res=0;
        int[] count=new int[26];

        for(int i=0;i<n;i++){
            Arrays.fill(count,0);
            for(int j=i;j<n;j++){
                boolean flag=true;
                int c=s.charAt(j)-'a';
                count[c]++;

                for(int x:count){
                    if(x>0 && x!=count[c]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    res=Math.max(res,j-i+1);
                }
            }
        }

        return res;
    }
}