class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int m=n-2;
        int [][]maxResult=new int [m][m];
        int max=0;
        for(int i=0;i<m;i++){
           for(int j=0;j<m;j++){
             max=0;
             for(int k=i;k<i+3;k++){
                for(int l=j;l<j+3;l++){
                    max=Math.max(max,grid[k][l]);
                }
             }
             maxResult[i][j]=max;
           } 
        }
        return maxResult;
    }
}