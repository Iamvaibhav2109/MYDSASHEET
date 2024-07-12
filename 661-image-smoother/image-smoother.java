class Solution {
    public int[][] imageSmoother(int[][] img) {
        int row=img.length;
        int col=img[0].length;
        int result[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                result[i][j]=helper(img,i,j);
            }
        }
        return result;
    }
    static int helper(int arr[][], int i, int j){
        int n = arr.length;
        int m = arr[0].length;
        int count = 1;
        int sum = arr[i][j];
        
        if(i-1>=0){
            sum+=arr[i-1][j];
            count++;
            if(j-1>=0){
                sum+=arr[i-1][j-1];
                count++;
            }
            if(j+1<m){
                sum+=arr[i-1][j+1];
                count++;
            }
        }

        if(i+1<n){
            sum+=arr[i+1][j];
            count++;
            if(j-1>=0){
                sum+=arr[i+1][j-1];
                count++;
            }
            if(j+1<m){
                sum+=arr[i+1][j+1];
                count++;
            }
        }
        if(j+1<m){
            sum+=arr[i][j+1];
            count++;
        }
        if(j-1>=0){
            sum+=arr[i][j-1];
            count++;
        }
        return sum/count;
    }
}
