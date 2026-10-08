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
    public void flatten(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root,list);
        TreeNode curr = root;
        for(int i=1;i<list.size();i++){
            curr.left = null;
            curr.right = new TreeNode(list.get(i));
            curr = curr.right;
        }
    }
    void traversal(TreeNode node,List<Integer>list){
        if(node==null) return;
        list.add(node.val);
        traversal(node.left,list);
        traversal(node.right,list);
    }
}