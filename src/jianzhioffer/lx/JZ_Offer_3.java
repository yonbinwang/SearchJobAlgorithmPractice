package jianzhioffer.lx;

import java.util.ArrayList;
import java.util.Collections;


public class JZ_Offer_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list_as= new ArrayList<>();
        while(listNode!=null) {
            list_as.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(list_as);
     return list_as;
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

