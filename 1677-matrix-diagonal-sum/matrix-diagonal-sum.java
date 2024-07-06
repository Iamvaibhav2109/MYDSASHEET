class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int j=0;
        int rowSize=mat.length;
        System.out.println(rowSize);
        for(int i=0;i<rowSize;i++){
                sum+=mat[i][i];
          }
        for(int i=rowSize-1;i>=0;i--){
            if(i!=j)
             sum+=mat[i][j];
            j++;
         }  
        return sum;

    }
}