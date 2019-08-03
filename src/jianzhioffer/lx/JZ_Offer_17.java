package jianzhioffer.lx;

public class JZ_Offer_17 {
    public void Mirror(TreeNode root) {
        if(root==null) return;
        if(root.left==null&&root.right==null)
            return;
        TreeNode temp=null;
        if(root.left==null&&root.right!=null)
        {   temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        if(root.left!=null&&root.right==null){
            temp=root.right;
            root.right=root.left;
            root.left=temp;
        }
        if(root.left!=null&&root.right!=null){
            temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        Mirror(root.left);
        Mirror(root.right);
    }
}
