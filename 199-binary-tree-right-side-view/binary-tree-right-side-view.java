/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        reversePreOrder(root,list,0);
        return list;
    }
    private void reversePreOrder(TreeNode root, List<Integer> list, int currentLevel){
        if(root ==null) return ;
        if (currentLevel == list.size())
         list.add(root.val);
        else
         list.set(currentLevel, root.val);
        reversePreOrder(root.left,list,currentLevel+1);
        reversePreOrder(root.right,list,currentLevel+1);
    }
}
