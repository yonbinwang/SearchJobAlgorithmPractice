package jianzhioffer.lx;

public class JZ_Offer_30 {

    //暴力法求解复杂度nlogn
  /*   public  int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for(int i=1;i<=n;i++) {
            int x=i;
            while (x != 0) {
                if (x% 10 == 1) count++;
                x = x / 10;
            }
        }
        return count;
    }*/
    //数组转换法复杂度nlogn
    public static int NumberOf1Between1AndN_Solution(int n) {
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<=n;i++) {
            sb.append(i);
        }
        int count=0;
        String str= sb.toString();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(2));

    }
    }


