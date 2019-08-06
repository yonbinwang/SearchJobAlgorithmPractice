package jianzhioffer.lx;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;


public class JZ_Offer_21 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        if(root==null)
            return arr;
        TreeNode head;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            head=queue.poll();
            arr.add(head.val);
            if(head.left!=null)//必须判定左孩子是否为空，不空则进入队列
                queue.offer(head.left);
            if(head.right!=null)//必须判定右孩子是否为空，不空就进入队列
                queue.offer(head.right);
        }
        return arr;
    }


}
