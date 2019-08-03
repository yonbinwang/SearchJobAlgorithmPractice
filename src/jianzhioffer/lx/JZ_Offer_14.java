package jianzhioffer.lx;

public class JZ_Offer_14 {

    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head==null)
            return null;
        int length=0;
        ListNode count=head;
        while(count!=null){
            length++;
            count=count.next;
        }
        System.out.println(length);
        int index=0;
        ListNode result=head;
        while(result!=null&&index<length-k)
        {    index++;
            result=result.next;
        }
        System.out.println(index);
        return result;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode it=head;
        ListNode x;
        for (int i = 2; i <=5 ; i++) {
            x = new ListNode(i);
            x.next = null;
            it.next = x;
            it = x;
        }
          /*  while (head!=null){
                System.out.println(head.val);
                head=head.next;
            }*/
//            System.out.println(FindKthToTail(head,1).val);


        }
    }



