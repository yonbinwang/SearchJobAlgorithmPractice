package jianzhioffer.lx;

import java.util.Arrays;

public class JZ_Offer_4 {

        //Arrays.copyOfRange(pre,1,i+1)表示从1开始复制（i+1）-1个数返回一个新的数组
        public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            if(in.length==0)
            {
                return null;
            }
            TreeNode root=new TreeNode(pre[0]);
            for(int i=0;i<in.length;i++)
            {
                if(pre[0]==in[i])
                {
                    root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                    root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                }
            }

            return root;
        }

    public static void main(String[] args) {
        char[] chars = "ssda".toCharArray();
        System.out.println(Arrays.copyOfRange(chars,1,3));
    }
}
//definition for binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
