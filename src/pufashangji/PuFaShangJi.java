package pufashangji;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;

public class PuFaShangJi {
    //1.找出正整数中偶数，并输出相加后的数，要用 long.
    public static  long findOuShu(){
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        sc.close();
        long os=0;
        long y=0;
        while (x/10!=0){
            y=x%10;
          if(y%2==0) os+=y;
            x=x/10;
        }

        return  os;
    }
  public static  int findZhengChuCount(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int x=1;
        int count=0;
        while (x<=n)
        {
            if(x%b==0) count+=1;
         x+=1;
        }

        return  count;
  }
  public static  void findTaiJieCounts(){
        Scanner sc=new Scanner(System.in);
      ArrayList<Integer> tj=new ArrayList<>();
      int y;
        while(sc.hasNextInt())//注意连续两次相当于读了两个输入
        {    y=sc.nextInt();
             if(y==0) break;
              tj.add(y);
        }
        sc.close();
      for (int x:tj) {
          System.out.println(count(x));
      }

  }
  public  static  int count(int n){
        if(n==1)
            return  1;
        if(n==2)
            return  2;
        return  count(n-1)+count(n-2);
  }
  public static boolean  isPrime(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2) return  false;
        if(n==2) return  true;
        int sqrt = (int) Math.sqrt(n);
      for (int i = 2; i <=sqrt ; i++) {
          if(n%i==0) return false;
      }
        return true;
  }
  public  static  void isRunNian(){
      for (int i = 1990; i <=2010 ; i++) {
          if ((i%4==0&&i%100!=0)||i%400==0)
              System.out.println(i);
      }
  }
public  static   void stringTR(){

}
public  static  int JieSheng(int n){
       if(n==1) return 1;
        return n*JieSheng(n-1);
}
public  static  void numberExchange(int n){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int [] arr=new int[n];
        int min,max,x;
    for (int i = 0; i <n ; i++) {
        x=sc.nextInt();
        arr[i]=x;
    }
    min=0;
    max=0;
    for (int i = 1; i <n ; i++) {
        if(arr[i]<arr[min]) min=i;
        if(arr[i]>arr[max]) max=i;
    }
    int temp=arr[0];
    arr[0]=arr[min];
    arr[min]=temp;
    temp=arr[n-1];
    arr[n-1]=arr[max];
    arr[max]=temp;
    for (int i = 0; i <n ; i++) {
        System.out.println(arr[i]);
    }
}
public static  int houziEatTaoZi(){
        Scanner sc =new Scanner(System.in);
        int days=sc.nextInt();
        int count=1;
    for (int i = 1; i <days ; i++) {
         count=2*(count+1);
    }
        return count ;
}
    public static  void main(String [] args) {
        //System.out.println(findOuShu());
        //System.out.println(findZhengChuCount());
        //findTaiJieCounts();
       // System.out.println(isPrime());
       // isRunNian();
       // System.out.println(JieSheng(5));
        // numberExchange(5);
        //System.out.println(houziEatTaoZi());




    }
}
