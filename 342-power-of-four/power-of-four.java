class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        else if(n==0){
            return false;
        }
        while(true){
            if(n%4!=0){
                return false;
            }
            n=n/4;
            if(n==1){
                return true;
            }
        }
    }
}