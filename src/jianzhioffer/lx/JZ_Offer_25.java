package jianzhioffer.lx;




public class JZ_Offer_25 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;
        TreeNode lastNodeInList=null;
        TreeNode  headNode=convertNode(pRootOfTree, lastNodeInList);
        while(headNode!=null&&headNode.left!=null){
            headNode=headNode.left;
        }
        return headNode;
    }
    public TreeNode convertNode(TreeNode root, TreeNode lastNodeInList){
        if(root==null)
            return null;
        TreeNode current= root;
        if(current.left!=null)
            lastNodeInList= convertNode(current.left,lastNodeInList);
        current.left=lastNodeInList;//根节点左指针指向左子树最后一个节点
        if(lastNodeInList!=null)
            lastNodeInList.right=current;//左子序列最后一个元素指向根节点点
        lastNodeInList=current;//更新最后一个节点指针
        if(current.right!=null)
            lastNodeInList=convertNode(current.right,lastNodeInList);
        return lastNodeInList;
    }

}

