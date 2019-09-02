package jianzhioffer.lx;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

public class JZ_Offer_23 {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>>  result=new ArrayList<>();
        Stack<Integer> path=new Stack<>();
        int current=0;//当前访问节点和
        Find(root,target,result,current,path);//查找路径
        //按路径长度降序排序
        result.sort(new Comparator<ArrayList<Integer>>(){
            @Override
            public int compare(ArrayList<Integer> o1,ArrayList<Integer> o2){
                return o2.size()-o1.size();//按照长度降序排序
            }
        });
        return result;
    }
    //按照树先序遍历递归并将节点入或出path栈
    public void Find(TreeNode root,int target,ArrayList<ArrayList<Integer>>  result,int current,Stack<Integer> path){
        if(root==null)
            return;
        current+=root.val;
        path.push(root.val);
        if(root.left==null&&root.right==null&&current==target)
        {
            ArrayList<Integer> listnode=new ArrayList();
            for(Integer x:path){//集合类顶级接口Collection继承Iterable接口所以集合都可直接迭代
                listnode.add(x);
            }
            result.add(listnode);//保存路径到result
        }
        if(root.left!=null)
            Find(root.left,target,result,current,path);
        if(root.right!=null)
            Find(root.right,target,result,current,path);
        current-=path.pop();//往上一层路径退栈并减去节点和
    }
}


