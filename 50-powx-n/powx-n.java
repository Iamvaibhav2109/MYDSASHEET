class Solution {
    public double myPow(double x, int n) {
        double result=1.0;
        if(x==1 || (x==-1 && n>0)){
            return x;
        }
        if(x==-1 && n==Integer.MIN_VALUE){
            return -x;
        }
        if(n==Integer.MIN_VALUE){
            return 0;
        }
        while(n>0){
           result*=x;
           n--;
        }
        while(n<0){
            result*=1/x;
            n++;
        }
        return result;
    }
}