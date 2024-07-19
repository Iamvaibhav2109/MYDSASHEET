class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int start=0;
        int end=n-1;
        while(start<end){
            int width = end-start;
            int minHeight=Math.min(height[start],height[end]);
            int currentArea = width * minHeight;
            max = Math.max(max, currentArea);
            if (height[start]<height[end]) {
                start++;
            } else {
                end--;
            }
        }
    return max;
   }
}