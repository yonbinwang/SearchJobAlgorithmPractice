package javastudy.test;

import java.util.Calendar;
import java.util.Date;

public class TestZH {
    public static int soulution(int n) {
        if(n==0)
          return 0;
        int count=0;
        while(n>0){
            if(n%10==2||n%10==4){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public  static  int daysToYear( ){
        int flag=0;
        int sum=0;
        int year=new Date().getYear();
        int [] x={31,29,31,30,31,30,31,31,30,31,30,31};
        int [] y={31,28,31,30,31,30,31,31,30,31,30,31};
        if(year%400==0||(year%4==0&&year%100!=0)){
            flag=1;
        }
        if(flag==1)
            for (int i = 0; i <=new Date().getMonth(); i++) {
                sum+=x[i];
            }
         else
            for (int i = 0; i <=new Date().getMonth(); i++) {
                sum+=y[i];
            }

        return  sum;

    }    public  static  void main(String [] args){
        System.out.println(daysToYear());
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
    }
}
