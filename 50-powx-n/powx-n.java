class Solution {
    public double myPow(double x, int n) {
         if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        if (x == -1) {
            return (n % 2 ==0)?1:-1;
        }
        long N = n;
        if (N<0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        double currentProduct = x;
        while (N > 0) {
            if (N % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            N /= 2;
        }
        return result;
    }
}