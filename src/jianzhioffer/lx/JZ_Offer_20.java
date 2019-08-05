package jianzhioffer.lx;
import java.util.Stack;
public class JZ_Offer_20 {

        public boolean IsPopOrder(int [] pushA,int [] popA) {
            Stack<Integer> data =new Stack<Integer>();
            int ha=0,pb=0;
            data.push(pushA[0]);
            while(pb<popA.length&&ha<pushA.length){
                while(data.peek()==popA[pb]){
                    data.pop();
                    pb++;
                    if(data.isEmpty()) break;
                }
                //其实这儿栈一定时为空的，加上data.isEmpty()判断便于理解
                if(pb==popA.length  && data.isEmpty())   break;//如果出栈序列所有元素皆从栈顶弹出且栈为空，则判定popA是一个出栈序列
                ha++;
                //其实这儿栈一定时不为空的，加上!data.isEmpty()判断便于理解
                if(ha==pushA.length && !data.isEmpty())  break;//如果入站序列所有元素已经入栈且栈不空，则判定popA不是出栈序列
                else
                    data.push(pushA[ha]);
            }
            return data.isEmpty();//退出时栈空则是，否则不是
        }


}
