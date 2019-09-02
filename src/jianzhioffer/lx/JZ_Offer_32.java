package jianzhioffer.lx;

import java.util.ArrayList;
import java.util.Collections;

public class JZ_Offer_32 {
 /*   public static  int GetUglyNumber_Solution(int index) {
        int count=0;
        int number=0;
        while(count<index){
            number+=1;
            if(isUglyNum(number)) count++;
        }
        return number;
    }
    //判断一个数是不是只由这些数构成的最佳策略
    public static  boolean isUglyNum(int n){
        while(n%2==0)
            n/=2;
        while(n%3==0)
            n/=3;
        while(n%5==0)
            n/=5;
        if(n==1)
            return true;
        else
            return false;
    }*/
  //技巧解法
 public  static int GetUglyNumber_Solution(int index) {
     if(index<=0)
         return 0;
     int [] ascUglyNums=new int[index];
     ascUglyNums[0]=1;
     int nextpos=1;
     int pos2=0;
     int pos3=0;
     int pos5=0;
     int min;
     while(nextpos<index){
         //对所有已有丑数x分别乘以2，3，5，找到对应x*2,x*3,x*5后第一个大于已有最大丑数的最小值
         min=Min(ascUglyNums[pos2]*2,ascUglyNums[pos3]*3,ascUglyNums[pos5]*5);

         ascUglyNums[nextpos]=min;
         while(ascUglyNums[pos2]*2<=min)//更新大于当前最大丑数的2倍丑数分界点
             pos2++;
         while(ascUglyNums[pos3]*3<=min)//更新大于当前最大丑数的3倍丑数分界点
             pos3++;
         while(ascUglyNums[pos5]*5<=min)//更新大于当前最大丑数的5倍丑数分界点
             pos5++;
         nextpos+=1;//更新为下一个要求得丑数数组坐标
     }
     return ascUglyNums[index-1]; //返回结果值（由于从数组下标从0开始必须-1）
 }
    public static int Min(int a,int b,int c)//求三个数得最小值
    {
        int min=Math.min(a,b);
        return Math.min(min,c);

    }

    public static void main(String[] args) {
       System.out.println(GetUglyNumber_Solution(1500));


    }
    }


