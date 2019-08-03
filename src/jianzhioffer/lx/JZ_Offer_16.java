package jianzhioffer.lx;

public class JZ_Offer_16 {

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        //遍历树每一个节点寻找A树中与子树根节点相同的节点
        boolean result=false;
        if(root1!=null && root2!=null)
        {
            if(root1.val==root2.val)
                //A存在与B根节点相同节点，判断以该节点为根的树是否包含以B为根的子树
                result=tree1HaveTree2(root1,root2);
            if(!result)
                //没有相同节点就继续遍历A左子树
                result=HasSubtree(root1.left,root2);
            if(!result)
                //没有左子树相同节点就继续遍历A右子树
                result=HasSubtree(root1.right,root2);

        }

        return result;//返回判定结果
    }
    public boolean tree1HaveTree2(TreeNode root1,TreeNode root2){
        if(root2==null)//如果root2所有节点都在root1中则判定root2是root1子树
            return true;
        if(root2!=null&&root1==null)//如果root2非空并root1为空则判定root2不是root1子树
            return false;
        if(root1.val!=root2.val)//如果root2非空并root1与root2值不相同则判定root2不是root1子树
            return false;
        //继续对比root1和root2左右子树是否相同
        return tree1HaveTree2(root1.left,root2.left) && tree1HaveTree2(root1.right,root2.right);
    }



}
