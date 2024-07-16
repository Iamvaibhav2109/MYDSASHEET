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