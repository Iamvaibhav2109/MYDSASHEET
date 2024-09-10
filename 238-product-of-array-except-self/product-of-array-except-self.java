class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        int maxProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                  count++;
            } else {
                maxProduct *= nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (count>1) {
                result[i] =0;
            } 
            else if(count==1){
               result[i]= nums[i]==0 ? maxProduct : 0;
            }
            else {
                result[i]=maxProduct/nums[i];
            }
        }
        return result;
    }
}


Without / operator:::

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate the left product for each element
        result[0] = 1;  // The first element has no left elements, so it's 1
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate the right product and multiply it with the left product
        int rightProduct = 1;  // Initialize right product as 1 (no right elements for the last element)
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;  // Multiply with the right product
            rightProduct *= nums[i];  // Update the right product
        }

        return result;
    }
}
    
