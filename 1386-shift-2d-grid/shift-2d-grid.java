class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
             int row=grid.length;
             int col=grid[0].length;
             k=k%(row*col);
             while(k-->0){
                int last=grid[row-1][col-1];
                for(int i=row-1;i>=0;i--){
                    for(int j=col-1;j>=0;j--){
                        if(i==0 && j==0)
                           grid[i][j]=last;
                        else if(i!=0 && j==0)
                            grid[i][j]=grid[i-1][col-1];
                        else
                            grid[i][j]=grid[i][j-1];       
                    }
                }
             }
                        ArrayList<Integer> result=new ArrayList<>();
                        return (List)Arrays.asList(grid);
    }

}