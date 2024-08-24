class Solution {
    private int n,m;
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        n=grid.length;
        if(n==0) return 0;
        m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                  ans=Math.max(ans,DFS(grid,i,j));  
                }
            }
        }
        return ans;
    }
    private int DFS(int[][]grid,int i, int j){
        if (i<0 || j<0 || i >= n|| j >= m || grid[i][j] != 1) return 0;
            grid[i][j] = 0;
           return 1+DFS(grid, i + 1, j)+DFS(grid, i - 1, j)+DFS(grid, i, j + 1)+DFS(grid, i, j - 1);
    }
}