/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original==null || original==target)
            return cloned;
        TreeNode oleft=original.left;
        TreeNode cleft=cloned.left;
        TreeNode left=getTargetCopy(oleft,cleft,target);
        if(left!=null)
            return left;
        TreeNode oright=original.right;
        TreeNode cright=cloned.right;
        TreeNode right=getTargetCopy(oright,cright,target);
        return right;
        
    }
}