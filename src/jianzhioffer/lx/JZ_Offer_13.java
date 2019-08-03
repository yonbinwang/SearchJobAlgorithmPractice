package jianzhioffer.lx;

public class JZ_Offer_13 {
    public void reOrderArray(int [] array) {
        int flag;
        int temp;
        //类似冒泡排序的思维
        for(int i=0;i<array.length;i++){//注意必须进行n次而不是n-1次
            flag=0;
            for(int j=array.length-1;j>i;j--)
                if(array[j]%2!=0&&array[j-1]%2==0){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    flag=1;
                }
            if(flag==0) return;//当一趟遍历没有需要交换的元素表示排序已经提前完成
        }

    }
//注意swap()传值交换不会改变原来数据
//ava中不能直接操作指针变量，int、double、float等基本类型函数传参（对象也是一样）的时候都是值传递
//也就是传入函数的只是原来变量的一个副本，所以在函数中交换是副本，并达不到交换的目的。
/*public void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
    }*/


    public static void main(String[] args) {

    }
}
