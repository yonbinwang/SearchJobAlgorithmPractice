package jianzhioffer.lx;


import java.util.Stack;

public class JZ_Offer_19 {
    Stack<Integer> stack1=new Stack<Integer>();//数据栈
    Stack<Integer> stack2=new Stack<Integer>();//辅助栈（栈顶元素为当前数据栈）
    int min;
    public void push(int node) {
        if(stack2.isEmpty()||stack1.isEmpty())
        {
            stack1.push(node);
            stack2.push(node);
        }
        else{
            stack1.push(node);
            if(stack2.peek()<=node)
                stack2.push(stack2.peek());
            else{
                stack2.push(node);

            }

        }
    }

    public void pop() {
        if(!stack2.isEmpty()&&!stack1.isEmpty())
        {
            stack1.pop();
            stack2.pop();
        }
    }

    public int top() {
        return stack2.pop();
    }

    public int min() {
        return  top();

    }

    
}
