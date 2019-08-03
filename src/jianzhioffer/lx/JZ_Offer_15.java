package jianzhioffer.lx;

public class JZ_Offer_15 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode  head=null;
        ListNode  temp=null;
        int flag=0;//保存头指针
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                if(flag==0)
                {
                    head=list1;
                    temp=list1;
                }
                else{
                    temp.next=list1;
                    temp=temp.next;
                }
                list1=list1.next;
            }
            else{
                if(flag==0)
                {
                    head=list2;
                    temp=list2;
                }
                else{
                    temp.next=list2;
                    temp=temp.next;
                }
                list2=list2.next;
            }
            flag++;
        }
        //合并剩下的表
        if(list1!=null)
            temp.next=list1;
        else
            temp.next=list2;
        return head;
    }

}
