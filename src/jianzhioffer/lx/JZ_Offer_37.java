package jianzhioffer.lx;


public class JZ_Offer_37 {
    public int TreeDepth(TreeNode root) {

        //思维策略
        //1.如果只有一个节点，那么深度为1
        //2.如果根节点左子树或右子树不为空，那么树深度等于：左或右子树深度+1
        //3.如果根节点左右子树都不为空，那么树深度等于：max(左子树深度，右子树深度)+1

        if(root==null)
            return 0;
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return (left>right)?(left+1):(right+1);
    }
}


