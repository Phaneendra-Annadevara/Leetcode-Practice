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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findsum(root,0,targetSum);
    }
    public boolean findsum(TreeNode node, int sum, int target){
        if(node==null) return false;
        else{
            sum += node.val;
            if(node.left==null && node.right==null){
                return sum==target;
            }
        }
        return findsum(node.left,sum,target)|| findsum(node.right,sum,target);
    }
}