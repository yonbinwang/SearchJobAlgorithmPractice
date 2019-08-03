package jianzhioffer.lx;

public class JZ_Offer_7 {
    //递归解法
    public int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2)
            return 1;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    //非递归解法
    /*public int Fibonacci(int n) {
        if (n==0)return 0;
        if(n==1||n==2)
            return 1;
        int[] fb= new int[n];;
        if(n>2) {

            fb[0] = 1;
            fb[1] = 1;
            for (int i = 2; i <n ; i++) {
                fb[i]=fb[i-1]+fb[i-2];
            }

        }
      return fb[n-1];
    }*/

    public static void main(String[] args) {
        JZ_Offer_7 jz_offer_7 = new JZ_Offer_7();
        System.out.println(jz_offer_7.Fibonacci(4));

    }
}
