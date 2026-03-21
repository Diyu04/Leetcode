class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
       // TC:  O(K^2)
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<k/2;i++){
            int top_row=x+i, bottom_row=x+k-1-i;
            for(int j=y;j<y+k;j++){
                int temp=grid[top_row][j];
                grid[top_row][j]=grid[bottom_row][j];
                grid[bottom_row][j]=temp;
            }
        }

        return grid;
    }
}