class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int low=0;
        int high=n-1;
        int left_max=0;
        int right_max=0;
        int water=0;
        //The amount of water trapped above a bar depends on the height of the tallest bars to its left and right. 
        //Specifically, the water trapped above a bar at position i is determined by the shorter of the tallest bars on its left and right sides minus the height of the bar itself.
        while(low<high){
            left_max=Math.max(height[low],left_max);
            right_max=Math.max(height[high],right_max);
          // If left_max is less than right_max, process the left side.
            if (left_max < right_max) {
                // Calculate trapped water at the current left position and move the left pointer right.
                water += left_max - height[low++];
            } else { // Otherwise, process the right side.
                // Calculate trapped water at the current right position and move the right pointer left.
                water += right_max - height[high--];
            }
        }
        return water;
    }
}