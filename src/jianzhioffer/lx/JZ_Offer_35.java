package jianzhioffer.lx;


import java.util.HashMap;

public class JZ_Offer_35 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        if(pHead1==null||pHead2==null)
        {
            return null;
        }
        while(pHead1!=null){
            Integer  x=pHead1.val;
            map.put(x,true);
            pHead1=pHead1.next;
        }
        while(pHead2!=null)
        {
            int key=pHead2.val;
            if(map.get(key)!=null){
                break;
            }
            pHead2=pHead2.next;
        }
        return pHead2;
    }
}


