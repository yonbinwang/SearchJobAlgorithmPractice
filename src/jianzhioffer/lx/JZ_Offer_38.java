package jianzhioffer.lx;
public class JZ_Offer_38 {
    //递归判断是否是平衡二叉树
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return true;
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        if(Math.abs(left-right)>1)
            return false;
        else
            return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
    //递归计算树的深度
    public  int TreeDepth(TreeNode root){
        if(root==null)
            return 0;
        int left =TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return (left>right)?(left+1):(right+1);
    }
}


