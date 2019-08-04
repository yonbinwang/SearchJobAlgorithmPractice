package jianzhioffer.lx;

public class JZ_Offer_20 {

import java.util.ArrayList;
import java.util.Stack;

    public class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            Stack<Integer> data =new Stack<Integer>();
            int pa=1,pb=0;
            data.push(pushA[0]);
            while(pb<popA.length){
                while(pa<pushA.length&&data.peek()!=popA[pb]){
                    data.push(pushA[pa]);
                    pa++;
                }
                if(pa==pushA.length)
                {
                    break;
                }
                else
                {
                    data.pop();
                    pb++;
                }
            }
            return data.isEmpty();
        }
    }


}
