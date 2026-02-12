class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;

        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;

    while(ans.size()<n*m){
        // left to right
        for(int i=left;i<=right && ans.size()<n*m;i++){
            ans.add(matrix[top][i]);
        }
            top++;

        // top to bottom
        for(int i=top;i<=bottom && ans.size()<n*m;i++){
            ans.add(matrix[i][right]);
        }
            right--;

        //right to left 
       
        for(int i=right;i>=left && ans.size()<n*m;i--){
            ans.add(matrix[bottom][i]);
        }
        
        bottom--;

        // bottom to top
        
        for(int i=bottom;i>=top && ans.size()<n*m;i--){
            ans.add(matrix[i][left]);
         }
        
        left++;
    }
        return ans;
    }
}