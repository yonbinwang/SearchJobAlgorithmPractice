package jianzhioffer.lx;

public class JZ_Offer_11 {

    //解法1投机取巧
   /* public int NumberOf1(int n) {
       return Integer.toBinaryString(n).replaceAll("0","").length();
    }*/
    //解法二
    //关键点：
    //1.负数在计算机中就是用补码表示的
    //2.把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0.那么一个整数的二进制有多少个1，就可以进行多少次这样的操作。

    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
