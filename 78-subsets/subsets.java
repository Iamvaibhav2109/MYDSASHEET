class Solution {
            List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList();
        if(nums==null || nums.length==0) return result;
        subset(nums,new ArrayList<Integer>(),0);
        return result;
    }
    public void subset(int[]nums,ArrayList<Integer>temp,int index){
        if(index>=nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        subset(nums, temp, index+1);
        temp.remove(temp.size()-1);

        subset(nums, temp, index+1);
    }
}