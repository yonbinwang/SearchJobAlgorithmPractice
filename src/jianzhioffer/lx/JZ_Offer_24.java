package jianzhioffer.lx;




public class JZ_Offer_24 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)
            return null;

        cloneNextNode(pHead);

        cloneRandomNode(pHead);

        return reConnectList(pHead);

    }
    //第一步：复制为A->A`->B->B`->C-C`,随机指针赋值为空
    public void cloneNextNode(RandomListNode pHead){
        RandomListNode clonenode;
        RandomListNode tempnode=pHead;
        while(tempnode!=null){
            clonenode=new RandomListNode(tempnode.label);
            clonenode.next=tempnode.next;
            clonenode.random=null;
            tempnode.next=clonenode;
            tempnode=clonenode.next;
        }
    }
    //第二步：更新上一步所得结果的random指针
    public void cloneRandomNode(RandomListNode pHead){
        RandomListNode initnode=pHead;
        RandomListNode clonenode;
        while(initnode!=null){
            clonenode=initnode.next;
            if(initnode.random!=null)
            {
                clonenode.random=initnode.random.next;
            }
            initnode=clonenode.next;
        }

    }
    //第三步：将A->A`->B->B`->C-C`...拆为A->B->C和A`->B`->C`
    public RandomListNode reConnectList(RandomListNode pHead) {

        RandomListNode  temp1=pHead;
        RandomListNode  temp2;
        RandomListNode  cloneHead=temp1.next;
        while(temp1!=null){
            temp2=temp1.next;
            temp1.next=temp2.next;//连接原来链表
            temp1=temp2.next;
            //一定要注意复制链表边的边界问题，例如temp1==null,temp2.next=temp1.next;将会产生空指针异常
            if(temp1==null)
                temp2.next=null;
            else
                temp2.next=temp1.next;//连接复制链表
        }
        return cloneHead;
    }

}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
